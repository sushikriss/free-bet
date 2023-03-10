package com.example.betfree.services;

import com.example.betfree.interfaces.TokenService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Service
public class TokensServiceImpl implements TokenService {
    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=bitcoin,ethereum,ripple,dogecoin,cardano,polygon,stellar,aave,litecoin,polkadot,monero&order=market_cap_desc&per_page=10&page=1&sparkline=false";
    private final OkHttpClient client = new OkHttpClient();

    @Override
    public String returnTokens() {
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
