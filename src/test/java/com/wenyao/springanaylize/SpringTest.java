package com.wenyao.springanaylize;

import com.wenyao.SpringBeanTest;
import org.junit.Test;

import com.wenyao.springanaylize.util.SpringContextHolder;

public class SpringTest extends SpringAnaylizeApplicationTests {

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.wenyao.SpringBeanTest");
        SpringBeanTest springBeanTest = (SpringBeanTest) aClass.newInstance();
        TestA bean = SpringContextHolder.getBean(TestA.class);
        springBeanTest.setTestA(bean);
        springBeanTest.testB();
    }

}
