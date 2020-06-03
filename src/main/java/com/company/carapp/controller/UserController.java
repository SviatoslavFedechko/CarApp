package com.company.carapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/")
    public String getHomepage() {
        return "index";
    }

    @RequestMapping("/user/name")
    @ResponseBody
    public String userName() {
        System.out.println("I'm in userName controller");
        return "Steven";
    }

}
