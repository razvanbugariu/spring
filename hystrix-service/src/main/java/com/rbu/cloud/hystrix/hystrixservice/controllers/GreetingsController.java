package com.rbu.cloud.hystrix.hystrixservice.controllers;

import com.rbu.cloud.hystrix.hystrixservice.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = "/hello/{name}")
    public String getGreetings(@PathVariable(value = "name") String name) {
        return greetingService.getGreetings(name);
    }

}
