package com.d5error;

import com.d5error.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources = new ClassPathResource("applicationContext.xml");
//        已被废弃
//        BeanFactory beanFactory = new XmlBenFactory(resources);
//        BookDao bookDao = beanFactory.getBean(BookDao.class);
//        bookDao.save();
    }
}
