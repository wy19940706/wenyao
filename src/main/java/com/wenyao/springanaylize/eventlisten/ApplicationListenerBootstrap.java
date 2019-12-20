package com.wenyao.springanaylize.eventlisten;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "com.wenyao.springanaylize.eventlisten")
public class ApplicationListenerBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(ApplicationListenerBootstrap.class).run(args);
        // run.addApplicationListener(new MyRegisterApplicationLister());
    }

}
