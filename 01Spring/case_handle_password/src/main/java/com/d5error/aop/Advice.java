package com.d5error.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
    @Pointcut("execution(boolean com.d5error.service.ResourcesService.openURL(*, *))")
    private void pointcut() {}

    @Around("Advice.pointcut()")
    public Object trimStr(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        args[1] = args[1].toString().trim();
        Object ret = joinPoint.proceed(args);
        return ret;
    }
}
