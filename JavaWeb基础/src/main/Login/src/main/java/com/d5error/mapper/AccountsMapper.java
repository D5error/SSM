package com.d5error.mapper;

import com.d5error.pojo.Account;

public interface AccountsMapper {
    Account selectByUsername(String username);

    void addAccount(Account account);
}
