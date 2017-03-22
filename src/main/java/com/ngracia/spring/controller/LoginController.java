package com.ngracia.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dev on 20/03/17.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        System.out.println("In the login method");
        return "login";
    }

    @RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
    public String loginFailed(Model model){
        System.out.println("Login Failed");

        model.addAttribute("error", "true");
        return "login";
    }

}
