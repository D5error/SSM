package com.d5error.service.impl;

import com.d5error.dao.AccountDao;
import com.d5error.domain.Account;
import com.d5error.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void insert(Account account) {
        accountDao.insert(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.selectById(id);
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
