package com.greendata.codechallenge.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT_INFO")
public class Account {

    @Id
    @Column(name = "account_number", nullable = false,unique = true)
    private String accountNumber;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "balance_date", nullable = false)
    private String balanceDate;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "opening_available_balance")
    private double openingAvailableBalance;

}
