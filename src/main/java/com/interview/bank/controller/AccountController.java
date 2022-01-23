package com.interview.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interview.bank.entity.Account;
import com.interview.bank.jwt.JwtToken;
import com.interview.bank.service.AccountService;

@RestController
@JwtToken
public class AccountController {
    private static String FAIL_MSG = "Action fail";

    private static String SUCCESS_MSG = "Action fail";

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccount();
    }

    @PostMapping(value = "/accounts")
    public String createAccount(@RequestBody Account account) {
        return accountService.createAccount(account) ? SUCCESS_MSG : FAIL_MSG;
    }

    @PutMapping(value = "/accounts")
    public String updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account) ? SUCCESS_MSG : FAIL_MSG;
    }

    @DeleteMapping(value = "/accounts/{id}")
    public String deleteAccount(@PathVariable(value = "id") int accountId) {
        return accountService.deleteAccount(accountId) ? SUCCESS_MSG : FAIL_MSG;
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable(value = "id") int accountId) {
        return accountService.getAccountById(accountId);
    }
}
