package com.d5error;

import com.d5error.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        DataSource dataSource = (DataSource) context.getBean("dataSource");
//        DataSource dataSource2 = (DataSource) context.getBean("dataSource2");
//        System.out.println(dataSource);
//        System.out.println(dataSource2);


        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
