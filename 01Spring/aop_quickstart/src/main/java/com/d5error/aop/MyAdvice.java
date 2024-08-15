package com.d5error.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
//    方法名任意
    @Pointcut("execution(void com.d5error.dao.BookDao.update())")
    private void pointCut(){}

    @Before("pointCut()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
