package com.d5error.service.impl;

import com.d5error.dao.impl.BookDaoImpl;
import com.d5error.service.BookService;
import com.d5error.dao.BookDao;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
