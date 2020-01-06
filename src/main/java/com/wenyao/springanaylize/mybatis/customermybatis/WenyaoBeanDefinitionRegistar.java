package com.wenyao.springanaylize.mybatis.customermybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class WenyaoBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annoAttrs = AnnotationAttributes
                .fromMap(importingClassMetadata.getAnnotationAttributes(WenyaoScan.class.getName()));
        AbstractBeanDefinition beanDefinition =
                BeanDefinitionBuilder.genericBeanDefinition(WenyaoFactoryBean.class).getBeanDefinition();
        beanDefinition.getPropertyValues()
                .add("mapperInterface", "com.wenyao.springanaylize.mybatis.customermybatis.dao.UserMapper");
        registry.registerBeanDefinition("wenyaoFactoryBean", beanDefinition);
    }
}
