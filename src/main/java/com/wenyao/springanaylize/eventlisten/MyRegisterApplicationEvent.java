package com.wenyao.springanaylize.eventlisten;

import org.springframework.context.ApplicationEvent;

/**
 * 发布的事件
 */
public class MyRegisterApplicationEvent extends ApplicationEvent {
    public MyRegisterApplicationEvent(Object source) {
        super(source);
    }
}
