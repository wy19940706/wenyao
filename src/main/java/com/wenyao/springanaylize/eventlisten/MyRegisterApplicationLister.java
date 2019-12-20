package com.wenyao.springanaylize.eventlisten;

import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Async
@Order(Ordered.LOWEST_PRECEDENCE + 1)
public class MyRegisterApplicationLister implements ApplicationListener<MyRegisterApplicationEvent> {

    @Override
    public void onApplicationEvent(MyRegisterApplicationEvent event) {
        log.info("MyRegisApplicationListener:name:{}", event.getClass().getName());
        log.info("MyRegisApplicationListener:getSource:{}", event.getSource());
        log.info("发送短信告知用户注册成功！");
    }
}
