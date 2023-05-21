package com.robin.springsecurity.modules.home;

import com.robin.springsecurity.modules.home.errors.StudentErrorResponse;
import com.robin.springsecurity.modules.home.errors.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handler(StudentNotFoundException exc) {
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handlerAll(Exception exc) {
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.CONFLICT.value(), exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }
    @GetMapping("/{index}")
    public Student getStudentById(@PathVariable int index) {
        if (index < 0 || index >= students.size()) throw new StudentNotFoundException("student not found");
        return students.get(index);
    }
}
