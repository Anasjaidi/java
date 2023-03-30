package com.hood.spring3overview.Rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${conf.name}")
    private String author;
    @RequestMapping("/")
    public String sayHello() {
        return "Hello, World, There!";
    }
    @RequestMapping("/hi")
    public String sayHi() {
        return "Hello " + author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
