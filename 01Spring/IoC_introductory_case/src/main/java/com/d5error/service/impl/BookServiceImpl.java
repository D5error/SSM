package com.d5error.service.impl;

import com.d5error.dao.BookDao;
import com.d5error.dao.impl.BookDaoImpl;
import com.d5error.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
