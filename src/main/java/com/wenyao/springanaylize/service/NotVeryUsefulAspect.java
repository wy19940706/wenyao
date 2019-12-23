package com.wenyao.springanaylize.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

    @Pointcut("execution(public * com.wenyao.springanaylize.service..*.*(..))")
    public void pointCut() {

    }

    @Before(value = "pointCut()")
    public void before() {
        System.out.println("======aop=======");
    }
}
