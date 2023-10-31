package com.learn.springoverview.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    String sayHello() {
        return "Hello";
    }
}
