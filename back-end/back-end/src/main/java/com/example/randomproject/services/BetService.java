package com.example.randomproject.services;

import com.example.randomproject.entities.Bet;

public interface BetService {

    boolean addBet(Bet bet);
    boolean removeBet(Bet bet);
}
