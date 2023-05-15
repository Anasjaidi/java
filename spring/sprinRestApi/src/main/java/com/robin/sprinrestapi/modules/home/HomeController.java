package com.robin.sprinrestapi.modules.home;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Data
class Student {
    private String firsName;
    private String lastName;

    private int id;
    public Student(String firsName, String lastName, int id) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
    }
}
@RestController
@RequestMapping("/api/v1/students")
public class HomeController {
    private List<Student> students;
    @PostConstruct
    public void fillStudents() {

        this.students = new ArrayList<>();

        students.add(new Student("anas", "jaidi", 1));
        students.add(new Student("robin", "hood", 2));
    }
    @GetMapping("/")
    public List<Student> getAllStudents() {
        return students;
    }
    @GetMapping("/{index}")
    public Student getStudentById(@PathVariable int index) {
        return students.get(index);
    }
}
