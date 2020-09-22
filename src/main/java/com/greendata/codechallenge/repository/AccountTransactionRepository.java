package com.greendata.codechallenge.repository;

import com.greendata.codechallenge.entity.AccountTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends CrudRepository<AccountTransaction, Long> {

    List<AccountTransaction> findByAccountNumber(@Param("accountNumber") String accountNumber);
}
