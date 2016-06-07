package com.ngracia.spring.controller;

import com.ngracia.spring.model.User;
import com.ngracia.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nestor Gracia on 24/05/2016.
 */
@Controller
public class UserController {


    private UserService userService;

    @Autowired(required=true)
    @Qualifier(value="userService")
    public void setUserService(UserService ps){
        this.userService = ps;
    }


    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String Login() {
        return "Login";
    }

    @RequestMapping(value= {"/Login"}, method=RequestMethod.POST)
    public String Login(@ModelAttribute("user") User p) {
        boolean result = userService.LogIn(p.getName(), p.getPassword());
        if (result){
            return "redirect:/UserList";
        }
        return "redirect:/";
    }

    @RequestMapping(value = { "/UserList" }, method = RequestMethod.GET)
    public String UserList(Model model) {
        model.addAttribute("listUsers", userService.getUsersList());
        return "UsersListView";
    }

}


