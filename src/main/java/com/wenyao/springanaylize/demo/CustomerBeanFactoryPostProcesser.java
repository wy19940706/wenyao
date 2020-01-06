package com.wenyao.springanaylize.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import com.wenyao.springanaylize.service.TestService;

import cn.hutool.core.lang.Console;

/**
 * 参与定制BeanFactory的初始化(spring容器化的时候将打了注解的类扫描封装成BeanDefinition并放到BeanDefinitionMap之后，可以对beanFactory容器进行后置处理)
 */
// @Component
public class CustomerBeanFactoryPostProcesser implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition cityServiceBeanDefinition =
                (GenericBeanDefinition) beanFactory.getBeanDefinition("cityService");
        Console.log(cityServiceBeanDefinition.getBeanClassName());
        cityServiceBeanDefinition.setBeanClass(TestService.class);
    }
}
