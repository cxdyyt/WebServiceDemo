package com.interview.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.interview.bank.dictionary.Gender;
import com.interview.bank.entity.Account;
import com.interview.bank.service.AccountService;

@SpringBootTest
public class AccountTest {
    @Autowired
    AccountService accountService;

    @Test
    public void testAddone() {
        Account account = new Account();
        account.setName("Beck");
        account.setGender(Gender.MAN.gender());
        accountService.save(account);
    }
}
