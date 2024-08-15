package com.d5error;

import com.d5error.config.SpringConfig;
import com.d5error.dao.ResourcesDao;
import com.d5error.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = context.getBean(ResourcesService.class);
        boolean test1 = resourcesService.openURL("https://www.github.com/d5error", "666");
        System.out.println(test1);

        boolean test2 = resourcesService.openURL("https://www.github.com/d5error", "123456");
        System.out.println(test2);

        boolean test3 = resourcesService.openURL("https://www.github.com/d5error", " 123456   ");
        System.out.println(test3);
    }
}
