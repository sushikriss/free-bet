package com.example.betfree.controllers;

import com.example.betfree.models.Token;
import com.example.betfree.services.TokensService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class CryptoController {

    @Autowired
    private TokensService tokenService;

    @GetMapping("tokens")
    public String returnedTokens() {
        return tokenService.returnTokens();
    }
}
