package com.d5error.service.impl;

import com.d5error.dao.AccountDao;
import com.d5error.domain.Account;
import com.d5error.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void insert(Account account) {
        accountDao.insert(account);
        this.selectAll();
        System.out.println();
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
        this.selectAll();
        System.out.println();
    }

    @Override
    public void deleteById(int id) {
        accountDao.deleteById(id);
        this.selectAll();
        System.out.println();
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }

    @Override
    public Account selectById(int id) {
        return accountDao.selectById(id);
    }
}
