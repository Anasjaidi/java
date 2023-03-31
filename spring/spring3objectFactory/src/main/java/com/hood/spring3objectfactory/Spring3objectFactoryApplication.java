package com.hood.spring3objectfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hood.utils", "com.hood.spring3objectfactory"})
public class Spring3objectFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring3objectFactoryApplication.class, args);
    }

}
