package com.wenyao.springanaylize.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.wenyao.springanaylize")
@Configuration
@EnableAspectJAutoProxy
public class ApplicationContextConfig {

    /**
     * 这是把对象交给spring容器进行管理
     */
    // @Bean(initMethod = "cutomerInit", destroyMethod = "customerDestory", name = "cityService")
    // @Order(1)
    // public CityService cityService() {
    // return new CityService();
    // }
}
