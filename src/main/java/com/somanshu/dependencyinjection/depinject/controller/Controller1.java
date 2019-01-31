package com.somanshu.dependencyinjection.depinject.controller;

import com.somanshu.dependencyinjection.depinject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Controller1 {

    private final GreetingService greetingService;

    @Autowired
    public Controller1(final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.getGreetings();
    }
}