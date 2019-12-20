package com.wenyao.springanaylize.annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationImpl implements Annotation {
    @Override
    public void test(@MyAnnotation(age = 12) int age, @MyAnnotation(age = 44) int ageTwo) {
        System.out.println(age+ageTwo);
    }
}
