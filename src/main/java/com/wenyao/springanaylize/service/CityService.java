package com.wenyao.springanaylize.service;

import org.springframework.stereotype.Component;

@Component("cityService")
public class CityService {

    public CityService() {
        System.out.println("init");
    }

    public void query() {
        System.out.println("this is query method");
    }
}
