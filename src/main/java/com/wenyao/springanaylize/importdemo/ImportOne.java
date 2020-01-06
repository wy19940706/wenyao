package com.wenyao.springanaylize.importdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportOne {

    @Bean
    public TestBeanOne testBeanOne() {
        return new TestBeanOne();
    }

    @Bean
    public TestBeanTwo testBeanTwo() {
        return new TestBeanTwo();
    }

    public void test() {
        System.out.println("this is import one");
    }
}
