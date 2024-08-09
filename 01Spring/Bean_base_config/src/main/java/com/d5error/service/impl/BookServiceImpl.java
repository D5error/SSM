package com.d5error.service.impl;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;

public class BookServiceImpl implements BookService {
//    不使用new，而是通过set方法
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();

    }
}
