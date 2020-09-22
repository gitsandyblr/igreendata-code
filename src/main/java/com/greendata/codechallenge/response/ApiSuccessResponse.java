package com.greendata.codechallenge.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.greendata.codechallenge.entity.Account;
import com.greendata.codechallenge.entity.AccountTransaction;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ApiSuccessResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Account> accounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AccountTransaction> accountTransactions;
}
