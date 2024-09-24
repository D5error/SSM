package com.d5error;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService);

    }
}
