package com.ngracia.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Nestor Gracia on 24/05/2016.
 */
@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) trows NotImplementedException {
        throw new NotImplementedException;
    }
}
