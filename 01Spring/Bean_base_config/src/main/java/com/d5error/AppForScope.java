package com.d5error;

import com.d5error.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        BookDao bookDao2 = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao2);
//        Spring默认单例
    }
}
