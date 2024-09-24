package com.d5error.service;

import com.d5error.domain.Account;
import java.util.List;

public interface AccountService {
    public void insert(Account account);
    public void delete(Integer id);
    public void update(Account account);
    public Account findById(Integer id);
    public List<Account> selectAll();
}
