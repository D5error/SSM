package com.d5error;

import com.d5error.config.SpringConfig;
import com.d5error.dao.BookDao;
import com.d5error.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao);

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
    }
}
