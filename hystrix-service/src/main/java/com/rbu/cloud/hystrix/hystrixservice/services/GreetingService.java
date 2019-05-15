package com.rbu.cloud.hystrix.hystrixservice.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {

    private static final String GREETINGS_ENDPOINT = "http://localhost:9090/hello/";

    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreetings(String name) {
        return new RestTemplate().getForObject(GREETINGS_ENDPOINT + name, String.class);
    }

    private String defaultGreeting(String username) {
        return "Hello, User!";
    }

}
