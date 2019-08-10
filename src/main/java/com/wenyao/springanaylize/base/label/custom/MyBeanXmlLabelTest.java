package com.wenyao.springanaylize.base.label.custom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hutool.core.lang.Console;

public class MyBeanXmlLabelTest {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybean-product.xml");
        Product product = (Product) applicationContext.getBean("product");
        Console.log(product.toString());
    }
}
