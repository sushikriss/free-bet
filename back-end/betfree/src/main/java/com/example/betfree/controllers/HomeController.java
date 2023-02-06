package com.example.betfree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/api/home")
    public String homePageToday() {
//        model.addAttribute("welcomeMessage", "Hello bro today's date is " + new java.util.Date());
//        return "index";
        return "Hello world";
    }
}
