package com.d5error;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithIoC {
    public static void main(String[] args) {
//        获取IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取Bean
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        BookService bookService = (BookService) context.getBean("bookService");

        bookDao.save();
        bookService.save();
    }
}
