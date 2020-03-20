package com.example.actuator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@RestController
public class HelloWorldController {

    @Value("${spring.profiles.active.print}")
    private String profilePrint;

    @GetMapping("/hello")
    public String printHello() {
        return "Hello World, " + profilePrint + "!";
    }

}