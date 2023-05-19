package com.robin.exceptionshandling.User.controller;

import com.robin.exceptionshandling.User.dto.UserRequest;
import com.robin.exceptionshandling.User.entity.User;
import com.robin.exceptionshandling.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    public ResponseEntity<User> saveUser(@RequestBody UserRequest req) {
        User user = service.saveUser(req);

        return ResponseEntity(201, user);
    }
}
