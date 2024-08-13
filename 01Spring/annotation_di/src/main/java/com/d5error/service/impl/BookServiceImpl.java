package com.d5error.service.impl;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
