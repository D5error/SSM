package com.d5error.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
    @Pointcut("execution(public void com.d5error.dao.BookDao.*(..))")
    private void pointcut(){}

    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("beforeAdvice");
    }

    @After("pointcut()")
    public void afterAdvice(){
        System.out.println("afterAdvice");
    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        pjp.proceed();
        System.out.println("around after advice");
    }
}
