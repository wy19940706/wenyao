package com.wenyao.springanaylize.importdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration("appConfigTwo")
@Import({ImportOne.class, ImportBeanDefinitionRegistrarTest.class, ImportSelectorTest.class})
public class AppConfig {

}
