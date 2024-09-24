package com.d5error;

import com.d5error.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context2 = new FileSystemXmlApplicationContext("C:\\Users\\D5\\Desktop\\SSM+SpringBoot_learning\\01Spring\\container\\src\\main\\resources\\applicationContext.xml");

        BookDao bookDao = (BookDao) context.getBean("bookDao");

        BookDao bookdao2 = context2.getBean("bookDao", BookDao.class);

        bookDao.save();
    }
}
