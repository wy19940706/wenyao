package com.wenyao;

import com.wenyao.springanaylize.TestA;

public class SpringBeanTest {

    private TestA testA;

    public void setTestA(TestA testA) {
        this.testA = testA;
    }

    public void testB() {
        testA.testA();
    }



}
