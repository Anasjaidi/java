package com.hood.spring3overview.Rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello, World, There!";
    }
    @RequestMapping("/hi")
    public String sayHi() {
        return "Hello!";
    }
}
