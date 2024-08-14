package com.d5error;

import com.d5error.config.SpringConfig;
import com.d5error.domain.Account;
import com.d5error.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);


        List<Account> accounts = accountService.selectAll();
        System.out.println(accounts);


        Account account = accountService.findById(1);
        System.out.println(account);

    }
}
