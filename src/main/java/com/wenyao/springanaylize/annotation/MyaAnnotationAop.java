package com.wenyao.springanaylize.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Created by Think on 2019/2/18
 */
@Aspect
@Component
public class MyaAnnotationAop {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyaAnnotationAop.class);

    // @Pointcut("@args(com.wenyao.springanaylize.annotation.MyAnnotation)")
    @Pointcut("execution( * *(.., @com.wenyao.springanaylize.annotation.MyAnnotation (*), ..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        try {
            Method proxyMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
            Annotation[][] parameterAnnotations = proxyMethod.getParameterAnnotations();
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                Object paramter = joinPoint.getArgs()[i];
                for (Annotation annotation : parameterAnnotations[i]) {
                    if (annotation != null) {

                    }
                }
            }
            Method targetMethod =
                    joinPoint.getTarget().getClass().getMethod(proxyMethod.getName(), proxyMethod.getParameterTypes());
            MyAnnotation myAnnotation = targetMethod.getAnnotation(MyAnnotation.class);
            ServletRequestAttributes attributes =
                    (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            int age = myAnnotation.age();
            String tip = "";
            if (age <= 30 && age > 0) {
                tip = "年龄小于30岁，还是先做程序员吧";
            }
            request.setAttribute("tip", tip);
        } catch (Throwable throwable) {
            LOGGER.error("有异常发生");
        }
    }
}
