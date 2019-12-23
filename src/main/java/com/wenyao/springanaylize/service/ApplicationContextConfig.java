package com.wenyao.springanaylize.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.wenyao.springanaylize")
@Configuration
@EnableAspectJAutoProxy
public class ApplicationContextConfig {

    @Bean(initMethod = "cutomerInit", destroyMethod = "customerDestory")
    public CityService cityService() {
        return new CityService();
    }
}
