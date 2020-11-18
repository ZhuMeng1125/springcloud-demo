package com.zh.eureka.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @RequsetMapping()
    public String getName(){
        return "test";
    }
}
