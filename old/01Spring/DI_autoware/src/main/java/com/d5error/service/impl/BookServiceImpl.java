package com.d5error.service.impl;

import com.d5error.service.BookService;
import com.d5error.dao.BookDao;

public class BookServiceImpl implements BookService {
    BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
