package com.wenyao.springanaylize.mybatis.customermybatis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wenyao.springanaylize.mybatis.customermybatis")
@WenyaoScan(value = "com.wenyao.springanaylize.mybatis.customermybatis.dao")
public class AppConfig {

    // @Bean
    // public UserMapper userMapper() {
    // return (UserMapper) WenyaoSession.queryMapper(UserMapper.class);
    // }
}
