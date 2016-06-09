package com.ngracia.spring.controller;

import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import com.ngracia.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nestor Gracia on 24/05/2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String Login() {
        return "Login";
    }

    @RequestMapping(value= {"/Login"}, method=RequestMethod.POST)
    public String Login(@ModelAttribute("user") User u) {
        boolean result = userService.LogIn(u.getName(), u.getPassword());
        if (result){
            return "redirect:/UserList";
        }
        return "redirect:/";
    }

    @RequestMapping(value = { "/UserList" }, method = RequestMethod.GET)
    public String UserList(Model model) {
        model.addAttribute("listUsers", userService.getUsersList());
        return "UserList";
    }

    @RequestMapping(value = {"/Edit/{id}"}, method = RequestMethod.GET)
    public String editUser(@PathVariable("id") int id, Model model){
        model.addAttribute("userDetails", userService.getUser(id));
        return "EditUser";
    }

    @RequestMapping(value = {"/Delete/{id}"}, method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") int id, Model model){
        userService.delete(id);
        model.addAttribute("ListUsers", userService.getUsersList());
        return "redirect:/UserList";
    }

    @RequestMapping(value = {"/Edit"}, method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("userDetails") UserDto userDto, Model model){
        userService.updateUser(userDto);
        return "redirect:/UserList";
    }
}


