package com.provider.service;

import com.api.service.DemoService;

public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
