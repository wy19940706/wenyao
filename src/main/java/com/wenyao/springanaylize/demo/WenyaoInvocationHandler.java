package com.wenyao.springanaylize.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WenyaoInvocationHandler implements InvocationHandler {

    Object target;

    public WenyaoInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("query before");
        Object invoke = method.invoke(target);
        System.out.println("query after");
        return invoke;
    }
}
