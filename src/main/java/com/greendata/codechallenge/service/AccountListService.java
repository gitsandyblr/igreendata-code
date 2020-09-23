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

        List<Account> accounts = new ArrayList<>();
        repository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }
}
