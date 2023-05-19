package com.robin.exceptionshandling.User.controller;

import com.robin.exceptionshandling.User.dto.UserRequest;
import com.robin.exceptionshandling.User.entity.User;
import com.robin.exceptionshandling.User.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid() UserRequest req) {
        User user = service.saveUser(req);

        System.out.println(user);

        return new ResponseEntity(user, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
    }
}
