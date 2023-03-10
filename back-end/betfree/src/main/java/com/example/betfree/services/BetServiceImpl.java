package com.example.betfree.services;

import com.example.betfree.entities.Bet;
import com.example.betfree.interfaces.BetService;
import com.example.betfree.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BetServiceImpl implements BetService {

    @Autowired
    private final BetRepository betRepository;

    public BetServiceImpl(BetRepository betRepository) {
        this.betRepository = betRepository;
    }

    @Override
    public boolean addBet(Bet bet) {
        this.betRepository.save(bet);
        return false;
    }

    @Override
    public boolean removeBet(Bet bet) {
        return false;
    }
}
