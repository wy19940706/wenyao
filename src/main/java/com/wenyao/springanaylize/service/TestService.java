package com.wenyao.springanaylize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    private CityService cityService;

    public TestService() {
        System.out.println("Construct from TestService");
    }
}
