package com.wenyao.springanaylize.service;

import org.springframework.beans.factory.FactoryBean;

public class CycleAFactoryBean implements FactoryBean<CycleA> {

    @Override
    public CycleA getObject() throws Exception {
        return new CycleA();
    }

    @Override
    public Class<?> getObjectType() {
        return CycleA.class;
    }
}
