package com.zh.eureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getUser(){
        return "eeee";
    }
}
