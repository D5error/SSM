package com.d5error;

import com.d5error.config.SpringConfig;
import com.d5error.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public  static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        BookDao bookDao2 = context.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao2);
        context.close();
    }
}
