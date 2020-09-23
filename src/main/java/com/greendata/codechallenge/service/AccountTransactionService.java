package com.greendata.codechallenge.service;

import com.greendata.codechallenge.entity.AccountTransaction;
import com.greendata.codechallenge.repository.AccountTransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AccountTransactionService {

    @Autowired
    AccountTransactionRepository repository;

    public List<AccountTransaction> getAccountTransactions(String accountNumber) {

        log.info("AccountTransactionService: Fetching transaction data on an account");
        List<AccountTransaction> transactions = new ArrayList<>();
        transactions = repository.findByAccountNumber(accountNumber);
        return transactions;
    }
}
