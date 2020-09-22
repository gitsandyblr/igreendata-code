package com.greendata.codechallenge.service;

import com.greendata.codechallenge.entity.Account;
import com.greendata.codechallenge.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AccountListService {

    @Autowired
    AccountRepository repository;

    public List<Account> getAccountList(){
        log.info("AccountListService: Fetching all accounts from repository ");

       /* Account account = Account.builder().accountNumber("585309209").accountName("SGSavings726")
                .accountType("Savings").balanceDate("08/11/2018").currency("SGD")
                .openingAvailableBalance(84327.51).build();*/

        List<Account> accounts = new ArrayList<>();
        repository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }
}
