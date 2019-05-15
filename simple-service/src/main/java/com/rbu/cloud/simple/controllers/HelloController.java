package com.rbu.cloud.simple.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController public class HelloController {

    @GetMapping(value = "/hello/{name}") public String sayHello(@PathVariable(value = "name") String name) {
        return "Hello, " + name + " !";
    }

}
