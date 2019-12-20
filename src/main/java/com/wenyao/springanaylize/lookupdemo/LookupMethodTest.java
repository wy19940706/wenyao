package com.wenyao.springanaylize.lookupdemo;

public abstract class LookupMethodTest {

    public void show() {
        this.getBean().show();
    }

    public abstract User getBean();
}
