package com.robin.sprinrestapi;

import com.robin.sprinrestapi.modules.employees.repository.EmployeesRepositoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SprinRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinRestApiApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeesRepositoryImpl repository) {
        return cmd -> {
            System.out.println("is in run");
        };
    }
}
