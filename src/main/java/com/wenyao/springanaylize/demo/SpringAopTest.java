// package com.wenyao.springanaylize.demo;
//
// import java.lang.reflect.Proxy;
//
// import org.springframework.beans.BeansException;
// import org.springframework.beans.factory.config.BeanPostProcessor;
// import org.springframework.stereotype.Component;
//
// @Component
// public class SpringAopTest implements BeanPostProcessor {
//
// @Override
// public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
// {
// if ("cityService".equals(beanName)) {
// Class<?> interfaceClass = bean.getClass().getInterfaces()[0];
// Class[] classes = {interfaceClass};
// Object proxyInstance = Proxy.newProxyInstance(SpringAopTest.class.getClassLoader(), classes,
// new WenyaoInvocationHandler(bean));
// return proxyInstance;
// }
// return bean;
// }
// }
