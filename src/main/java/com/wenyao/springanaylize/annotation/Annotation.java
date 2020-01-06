package com.wenyao.springanaylize.annotation;

public interface Annotation {

    @MyAnnotation(age = 45)
    void test(@MyAnnotation(age = 33) int age, @MyAnnotation(age = 55) int ageTwo);

    void testId(@IdExist User user, @MyAnnotation(age = 33) int age, @MyAnnotation(age = 55) int ageTwo);
}
