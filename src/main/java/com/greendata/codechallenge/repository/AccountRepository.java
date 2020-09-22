package com.greendata.codechallenge.repository;

import com.greendata.codechallenge.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
