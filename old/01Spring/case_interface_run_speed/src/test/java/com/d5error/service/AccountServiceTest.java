package com.d5error.service;

import com.d5error.config.SpringConfig;
import com.d5error.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testInsert(){
        Account account = new Account();
        account.setName("d5error");
        account.setId(3);
        account.setMoney(123456789);
        accountService.insert(account);
    }

    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setName("Tom");
        account.setId(1);
        account.setMoney(66666);
        accountService.update(account);
    }

    @Test
    public void testDelete(){
        accountService.deleteById(3);
    }

    @Test
    public void testSelectAll(){
        List<Account> ls = accountService.selectAll();
        System.out.println(ls);
    }

    @Test
    public void testSelectById(){
        Account account = accountService.selectById(1);
        System.out.println(account);
    }
}
