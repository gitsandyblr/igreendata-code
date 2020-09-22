package com.greendata.codechallenge.controller;

import com.greendata.codechallenge.entity.Account;
import com.greendata.codechallenge.entity.AccountTransaction;
import com.greendata.codechallenge.response.ApiResponse;
import com.greendata.codechallenge.response.ApiSuccessResponse;
import com.greendata.codechallenge.service.AccountListService;
import com.greendata.codechallenge.service.AccountTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

    @Autowired
    AccountListService listService;

    @Autowired
    AccountTransactionService transactionService;

    @RequestMapping("/getAccountList")
    public ResponseEntity<ApiResponse> getAccountList(){
        List<Account> accounts = listService.getAccountList();
        ApiSuccessResponse successResponse = ApiSuccessResponse.builder().accounts(accounts).build();
        ApiResponse apiResponse = ApiResponse.builder().successResponse(successResponse).build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }


    @RequestMapping("/getAccountTransaction")
    public ResponseEntity<ApiResponse> getAccountTransaction(@PathParam("accountNumber") String accountNumber){
        List<AccountTransaction> transactions = transactionService.getAccountTransactions(accountNumber);
        ApiSuccessResponse successResponse = ApiSuccessResponse.builder().accountTransactions(transactions).build();
        ApiResponse apiResponse = ApiResponse.builder().successResponse(successResponse).build();
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
