package com.robin.sprinrestapi.modules.home;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
class Student {
    private String firsName;
    private String lastName;

    private int index;
    public Student(String firsName, String lastName, int index) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.index = index;
    }
}
@RestController
@RequestMapping("/api/v1/students")
public class HomeController {
    @GetMapping("/{index}")
    public Student Home(@PathVariable int index) {
        Student s1 = new Student("anas", "jaidi", index);
        return s1;
    }
}
