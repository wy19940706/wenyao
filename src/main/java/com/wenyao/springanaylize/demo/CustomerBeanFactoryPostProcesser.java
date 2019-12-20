package com.wenyao.springanaylize.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import com.wenyao.springanaylize.service.TestService;

import cn.hutool.core.lang.Console;

/**
 * 参与定制BeanFactory的初始化
 */
@Component
public class CustomerBeanFactoryPostProcesser implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition cityService = (GenericBeanDefinition) beanFactory.getBeanDefinition("cityService");
        Console.log(cityService.getBeanClassName());
        cityService.setBeanClass(TestService.class);
    }
}
