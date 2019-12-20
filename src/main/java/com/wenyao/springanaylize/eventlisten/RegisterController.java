package com.wenyao.springanaylize.eventlisten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/hello")
    public String register() {
        context.publishEvent(new MyRegisterApplicationEvent("注冊成功"));
        return "ok";
    }
}
