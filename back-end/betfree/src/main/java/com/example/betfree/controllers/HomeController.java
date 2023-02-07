package com.example.betfree.controllers;

import com.example.betfree.entities.User;
import com.example.betfree.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class HomeController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("users")
    public List<User> returnUsers() {
      return this.userRepository.findAll();
    }

//    @GetMapping("home")
//    public String homePageToday() {
////        model.addAttribute("welcomeMessage", "Hello bro today's date is " + new java.util.Date());
////        return "index";
//        return "Hello world";
//    }
}
