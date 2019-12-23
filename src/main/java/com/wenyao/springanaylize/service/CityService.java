package com.wenyao.springanaylize.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

// @Component("cityService")
public class CityService implements InitializingBean, DisposableBean {

    @Autowired
    private TestService testService;

    public CityService() {
        System.out.println("construct from cityService");
    }

    public void query() {
        System.out.println("this is query method");
    }

    public void cutomerInit() {
        System.out.println("cutomerInit");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }

    public void customerDestory() {
        System.out.println("customerDestory");
    }
}
