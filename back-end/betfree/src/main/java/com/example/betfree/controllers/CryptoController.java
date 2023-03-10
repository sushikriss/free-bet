package com.example.betfree.controllers;

import com.example.betfree.services.TokensServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class CryptoController {

    @Autowired
    private TokensServiceImpl tokenService;

    @GetMapping("tokens")
    public String returnedTokens() {
        return tokenService.returnTokens();
    }
}
