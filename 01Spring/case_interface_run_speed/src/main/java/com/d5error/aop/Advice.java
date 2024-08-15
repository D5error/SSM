package com.d5error.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.d5error.service.*Service.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        String className = signature.getDeclaringTypeName();

        long startTime = System.currentTimeMillis();
        Object ret = joinPoint.proceed();
        Long endTime = System.currentTimeMillis();
        Long costTime = endTime - startTime;
        System.out.println(className + "." + methodName + " 消耗的时间为：" +  costTime + "ms");
        return ret;
    }
}
