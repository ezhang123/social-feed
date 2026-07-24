package com.eric.socialfeed.controller;

import com.eric.socialfeed.model.Account;
import com.eric.socialfeed.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/users")
    public List<Account> getUsers(){
        return accountService.getUsers();
    }

    @PostMapping("/users")
    public Account createUser(@RequestBody Account account) {
        return accountService.createUser(account);
    }

    @GetMapping("/users/{id}")
    public Account getUserById(@PathVariable int id){
        return accountService.getUserById(id);
    }
}
