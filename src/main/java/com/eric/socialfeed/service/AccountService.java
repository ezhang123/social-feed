package com.eric.socialfeed.service;

import com.eric.socialfeed.model.Account;
import com.eric.socialfeed.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public List<Account> getUsers() {
        return accountRepository.findAll();
    }

    public Account createUser(Account account) {
        return accountRepository.save(account);
    }


}
