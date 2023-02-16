package com.example.betfree.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
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

}
