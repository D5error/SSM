package com.d5error;

import com.d5error.config.SpringConfig;
import com.d5error.dao.AccountDao;
import com.d5error.domain.Account;
import com.d5error.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);

//        Account account = new Account();
//        account.setMoney(114514);
//        account.setName("d5");
//        account.setId(2);
//        accountService.save(account);
        Account id = accountService.findById(2);
        System.out.println(id);
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
