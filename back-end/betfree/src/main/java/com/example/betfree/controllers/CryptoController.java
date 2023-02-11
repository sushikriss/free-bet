package com.example.betfree.controllers;

import com.example.betfree.models.Token;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class CryptoController {
    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=bitcoin,ethereum,ripple,dogecoin,cardano,polygon,stellar,aave,litecoin,polkadot,monero&order=market_cap_desc&per_page=10&page=1&sparkline=false";

    private final OkHttpClient client = new OkHttpClient();

    @GetMapping("tokens")
    public String returnedTokens() {
        Request request = new Request.Builder()
                .url(API_URL)
                .build();
        try {
            Response response = client.newCall(request).execute();
            assert response.body() != null;
            return response.body().string();
        } catch (Exception error) {
            System.out.println("Error in API token call");
        }
        return "null";
    }
}
