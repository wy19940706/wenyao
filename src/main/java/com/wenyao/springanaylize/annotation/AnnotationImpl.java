package com.wenyao.springanaylize.annotation;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import cn.hutool.json.JSONUtil;

@Service
public class AnnotationImpl implements Annotation {
    @Override
    public void test(@MyAnnotation(age = 12) int age, @MyAnnotation(age = 44) int ageTwo) {
        System.out.println(age + ageTwo);
    }

    @Override
    public void testId(@RequestBody @IdExist User user, @MyAnnotation(age = 12) int age,
            @MyAnnotation(age = 44) int ageTwo) {
        System.out.println(JSONUtil.toJsonStr(user));
    }
}
