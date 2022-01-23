package com.interview.bank.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.interview.bank.entity.Account;

public interface AccountService extends IService<Account> {

    List<Account> getAllAccount();

    Account getAccountById(int accountId);

    boolean createAccount(Account account);

    boolean deleteAccount(int id);

    boolean updateAccount(Account account);

}