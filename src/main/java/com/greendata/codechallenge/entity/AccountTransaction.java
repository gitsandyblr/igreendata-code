package com.greendata.codechallenge.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT_TRANSACTION")
public class AccountTransaction {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "acct_tran_id", nullable = false)
    private String acctTranid;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "value_date", nullable = false)
    private String valueDate;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "debit_amount")
    private double debitAmount;

    @Column(name = "credit_amount")
    private double creditAmount;

    @Column(name = "db_cr_flag")
    private String dbCr;

    @Column(name = "tran_narrative")
    private String transactionNarrative;

}
