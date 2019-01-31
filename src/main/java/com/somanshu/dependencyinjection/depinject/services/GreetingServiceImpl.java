package com.somanshu.dependencyinjection.depinject.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGreetings() {
        return "Hello from GreetingServiceImpl!";
    }
}