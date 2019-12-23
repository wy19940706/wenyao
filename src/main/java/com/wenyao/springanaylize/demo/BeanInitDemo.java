package com.wenyao.springanaylize.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wenyao.springanaylize.service.ApplicationContextConfig;
import com.wenyao.springanaylize.service.CityService;

/**
 * bean实例化过程分析demo
 */
public class BeanInitDemo {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        // 自定义循环依赖标志
        // applicationContext.register(ApplicationContextConfig.class);
        //
        // AbstractAutowireCapableBeanFactory beanFactory =
        // (AbstractAutowireCapableBeanFactory) applicationContext.getBeanFactory();
        // beanFactory.setAllowCircularReferences(Boolean.FALSE);
        //
        // applicationContext.refresh();

        CityService cityService = (CityService) applicationContext.getBean("cityService");
        // cityService.query();
        // bean.test();
        // QueryInterface queryInterface = applicationContext.getBean(QueryInterface.class);
        // queryInterface.query();
        // Annotation annotation = applicationContext.getBean(Annotation.class);
        // annotation.test(11, 22);
    }
}
