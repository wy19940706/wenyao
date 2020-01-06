package com.wenyao.springanaylize.importdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ImportOne bean = applicationContext.getBean(ImportOne.class);
        bean.test();
        TestBeanOne bean1 = applicationContext.getBean(TestBeanOne.class);
        bean1.testBeanOne();
        TestBeanTwo bean2 = applicationContext.getBean(TestBeanTwo.class);
        bean2.testBeanTwo();
        TestBeanThree bean3 = applicationContext.getBean(TestBeanThree.class);
        bean3.testBeanThree();
        TestBeanFour bean4 = applicationContext.getBean(TestBeanFour.class);
        bean4.testBeanFour();
    }

}
