package com.ug.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginController")
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestBody String str){
        return null;
    }
}
