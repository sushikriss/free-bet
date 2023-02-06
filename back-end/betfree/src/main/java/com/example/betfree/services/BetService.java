package com.example.betfree.services;


import com.example.betfree.entities.Bet;

public interface BetService {

    boolean addBet(Bet bet);
    boolean removeBet(Bet bet);
}
