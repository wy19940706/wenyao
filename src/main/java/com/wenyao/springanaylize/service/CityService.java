package com.wenyao.springanaylize.service;

import org.springframework.stereotype.Component;

@Component("cityService")
public class CityService implements QueryInterface {

    public CityService() {
        System.out.println("init");
    }

    @Override
    public void query() {
        System.out.println("this is query method");
    }
}
