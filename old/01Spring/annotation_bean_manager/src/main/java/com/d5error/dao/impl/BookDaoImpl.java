package com.d5error.dao.impl;

import com.d5error.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
//@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init ...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy ...");
    }
}
