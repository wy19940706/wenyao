package com.wenyao.springanaylize.mybatis.customermybatis;

import java.lang.reflect.Proxy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WenyaoSession {
    public static Object queryMapper(Class clazz) {
        return Proxy.newProxyInstance(WenyaoSession.class.getClassLoader(), new Class[] {clazz},
                new WenyaoInvocationHandler());
    }
}
