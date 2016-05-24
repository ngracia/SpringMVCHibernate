package com.ngracia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nestor Gracia on 24/05/2016.
 */
@Controller
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap){

    }
}
