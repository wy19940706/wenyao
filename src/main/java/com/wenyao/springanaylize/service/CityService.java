package com.wenyao.springanaylize.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.wenyao.springanaylize.TestA;

@Component("cityService")
public class CityService implements City, InitializingBean, DisposableBean, ApplicationContextAware, BeanFactoryAware {

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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBean(TestService.class);
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        beanFactory.getBean(TestA.class);
    }

    @Override
    public void printCity() {
        System.out.println("this is chengdu");
    }
}
