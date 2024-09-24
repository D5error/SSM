package com.d5error.service;

import com.d5error.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    void insert(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);
}
