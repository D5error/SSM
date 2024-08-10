package com.d5error.service.impl;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("book service init ...");
    }

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("service save ...");
        bookDao.save();
    }
}
