package com.wenyao.springanaylize.mybatis.customermybatis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        // ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // beanFactory.registerSingleton("userMapper", WenyaoSession.queryMapper(UserMapper.class));
        context.refresh();
        System.out.println(context.getBean("&wenyaoFactoryBean"));
        context.getBean(UserService.class).getUserList();
        // UserMapper userMapper = (UserMapper) WenyaoSession.queryMapper(UserMapper.class);
        // userMapper.getUserList();
    }
}
