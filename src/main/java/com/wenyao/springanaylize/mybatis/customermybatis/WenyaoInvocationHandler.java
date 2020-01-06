package com.wenyao.springanaylize.mybatis.customermybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.ibatis.annotations.Select;

public class WenyaoInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("connect db");
        Select annotation = method.getAnnotation(Select.class);
        if (annotation != null) {
            String sql = annotation.value()[0];
            System.out.println(sql);
        }
        if (method.getName().equals("toString")) {
            return proxy.getClass().getInterfaces()[0].getName();
        }
        return null;
    }
}
