package com.example.betfree.entities;

import com.example.betfree.enums.RoleEnum;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "user_level")
    private int userLevel;
    @Column(name = "total_bet_amount")
    private double userTotalBetAmount;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToMany
    private List<Bet> userBets;

    public User() {
    }

    public User(String fullName, String username, String email, String password, int userLevel, double userTotalBetAmount) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userLevel = userLevel;
        this.userTotalBetAmount = userTotalBetAmount;
    }

    public List<Bet> getUserBets() {
        return userBets;
    }

    public void setUserBets(List<Bet> userBets) {
        this.userBets = userBets;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public double getUserTotalBetAmount() {
        return userTotalBetAmount;
    }

    public void setUserTotalBetAmount(double userTotalBetAmount) {
        this.userTotalBetAmount = userTotalBetAmount;
    }
}
