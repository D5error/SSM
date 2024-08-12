package com.d5error.service.impl;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("bookService")
//@Service("bookService")
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
