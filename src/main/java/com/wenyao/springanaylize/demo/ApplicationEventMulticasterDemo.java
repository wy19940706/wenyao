package com.wenyao.springanaylize.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

public class ApplicationEventMulticasterDemo {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
        simpleApplicationEventMulticaster.addApplicationListener(event -> {
            if (event instanceof PayloadApplicationEvent) {
                System.out.println(
                        "接收到PayloadApplicationEvent：" + PayloadApplicationEvent.class.cast(event).getPayload());
            } else {
                System.out.println("接收到事件：" + event);
            }
        });
        simpleApplicationEventMulticaster.multicastEvent(new MyEvent("hello world"));
        simpleApplicationEventMulticaster.multicastEvent(new PayloadApplicationEvent<Object>("2", "hello world"));
    }

    private static class MyEvent extends ApplicationEvent {
        public MyEvent(Object source) {
            super(source);
        }
    }
}
