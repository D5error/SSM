package com.d5error.service;

import com.d5error.domain.Account;

import java.util.List;

public interface AccountService {
    void insert(Account account);

    void update(Account account);

    void deleteById(int id);

    List<Account> selectAll();

    Account selectById(int id);
}
