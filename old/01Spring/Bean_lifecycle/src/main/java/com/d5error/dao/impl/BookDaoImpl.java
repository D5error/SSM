package com.d5error.dao.impl;

import com.d5error.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }


    public void init(){
        System.out.println("book dao init ...");
    }

    public void destroy(){
        System.out.println("book dao destroy ...");
    }
}
