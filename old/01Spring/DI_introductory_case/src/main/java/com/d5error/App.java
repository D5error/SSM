package com.d5error;

import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao boookDao = (BookDao) context.getBean("bookDao");
        BookService boookService = (BookService) context.getBean("bookService");


        boookService.save();
    }
}
