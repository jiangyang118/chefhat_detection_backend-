package com.example.chefhat_detection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageInitController {

    @GetMapping("/monitoring")
    public String monitoring(){
        return "monitoring";
    }
    @GetMapping("/alam")
    public String alam(){
        return "alam";
    }
    @GetMapping("/history")
    public String history(){
        return "history";
    }
    @GetMapping("/baiduMap")
    public String baiduMap(){
        return "baiduMap";
    }
    @GetMapping("/login")
    public String login(){ return "login"; }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @GetMapping("/users")
    public String users(){
        return "users";
    }



    
}