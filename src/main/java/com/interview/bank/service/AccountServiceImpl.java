package com.interview.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.interview.bank.entity.Account;
import com.interview.bank.mapper.AccountMapper;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public List<Account> getAllAccount() {
        List<Account> allAccounts = list();
        return allAccounts;
    }

    @Override
    public Account getAccountById(int accountId) {
        return getById(accountId);
    }

    @Override
    public boolean createAccount(Account account) {
        return save(account);
    }

    @Override
    public boolean deleteAccount(int id) {
        return removeById(id);
    }

    @Override
    public boolean updateAccount(Account account) {
        return updateById(account);
    }

}
