package com.example.betfree.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "bet")
public class Bet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "bet_active")
    private boolean isActive;

    @Column(name = "token_name")
    private String tokenName;

    @Column(name = "bet_amount")
    private double amount;

    @Column(name = "bet_created")
    private Date dateCreated;

    @Column(name = "bet_expected_price")
    private double expectedPrice;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bet() {
    }

    public Bet(boolean isActive, String tokenName, double amount, Date dateCreated, double expectedPrice) {
        this.isActive = isActive;
        this.tokenName = tokenName;
        this.amount = amount;
        this.dateCreated = dateCreated;
        this.expectedPrice = expectedPrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(double expectedPrice) {
        this.expectedPrice = expectedPrice;
    }
}
