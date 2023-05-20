package com.robin.jpa;

import com.robin.jpa.student.entity.Student;
import com.robin.jpa.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpa {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpa.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return command -> {
            repository.save(Student.builder(0l, "anas", "jaidi", "anas.jaidi@icloud.com", 20));
        };
    }
}
