package com.example.betfree.controllers;

import com.example.betfree.entities.User;
import com.example.betfree.repository.UserRepository;
import com.example.betfree.services.UserServiceImpl;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("users")
    public User returnUsers() {
        long value = 4;
        return this.userService.getUserById(value);
    }

    @GetMapping("home")
    public String homePageToday() {
//        model.addAttribute("welcomeMessage", "Hello bro today's date is " + new java.util.Date());
//        return "index";
        return "Hello world";
    }
}
