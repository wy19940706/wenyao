package com.wenyao.springanaylize.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wenyao.springanaylize.service.ApplicationContextConfig;
import com.wenyao.springanaylize.service.TestService;

import cn.hutool.core.lang.Console;

/**
 * bean实例化过程分析demo
 */
public class BeanInitDemo {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        Console.log(applicationContext.getBean(TestService.class));

        TestService bean = (TestService) applicationContext.getBean("cityService");
        bean.test();
        // QueryInterface queryInterface = applicationContext.getBean(QueryInterface.class);
        // queryInterface.query();
        // Annotation annotation = applicationContext.getBean(Annotation.class);
        // annotation.test(11, 22);
    }
}
