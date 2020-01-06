package com.wenyao.springanaylize.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
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

import cn.hutool.core.util.ObjectUtil;

/**
 * Created by Think on 2019/2/18
 */
@Aspect
@Component
public class MyaAnnotationAop {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyaAnnotationAop.class);

    // @Pointcut("@args(com.wenyao.springanaylize.annotation.IdExist)")
    @Pointcut("execution( * *(.., @com.wenyao.springanaylize.annotation.IdExist (*), ..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        try {
            Method proxyMethod = ((MethodSignature) joinPoint.getSignature()).getMethod();
            Annotation[][] parameterAnnotations = proxyMethod.getParameterAnnotations();
            boolean flag = false;
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                Object paramter = joinPoint.getArgs()[i];
                for (Annotation annotation : parameterAnnotations[i]) {
                    if (annotation != null && annotation.annotationType() == IdExist.class) {
                        Field idField = paramter.getClass().getDeclaredField("id");
                        idField.setAccessible(true);
                        Long id = (Long) idField.get(paramter);
                        if (ObjectUtil.isNotNull(id)) {
                            flag = true;
                            System.out.println(id);
                            break;
                        }
                    }
                }
                if (flag) {
                    break;
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

    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println();
    }
}
