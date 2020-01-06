package com.wenyao.springanaylize.mybatis.customermybatis;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Import(WenyaoBeanDefinitionRegistar.class)
@Target(ElementType.TYPE)
public @interface WenyaoScan {
    String[] value() default {};
}
