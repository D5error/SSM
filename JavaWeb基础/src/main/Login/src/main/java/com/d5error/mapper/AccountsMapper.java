package com.d5error.mapper;

import com.d5error.pojo.Account;

import java.util.ArrayList;

public interface AccountsMapper {
    Account selectByUsername(String username);

    void addAccount(Account account);

    ArrayList<Account> selectAll();
}
