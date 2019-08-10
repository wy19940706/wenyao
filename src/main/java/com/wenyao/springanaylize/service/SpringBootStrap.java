package com.wenyao.springanaylize.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootStrap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        CycleA cycleA = (CycleA) applicationContext.getBean("cycleAFactoryBean");
        System.out.println(cycleA.toString());
        CycleAFactoryBean factoryBean = (CycleAFactoryBean) applicationContext.getBean("&cycleAFactoryBean");
        System.out.println(factoryBean.toString());
        cycleA.methodOne();
    }

}
