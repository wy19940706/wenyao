package com.wenyao.springanaylize.replacedemo;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceClass implements MethodReplacer {
    /**
     * Reimplement the given method.
     *
     * @param obj the instance we're reimplementing the method for
     * @param method the method to reimplement
     * @param args arguments to the method
     * @return return value for the method
     */
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("new method of replace");
        return null;
    }
}
