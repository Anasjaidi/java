package com.robin.springsecurity.modules.base.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/base")
public class baseController {
    @GetMapping
    public ResponseEntity<String> base() {
        return ResponseEntity.ok().body("base");
    }
    @GetMapping("back")
    public ResponseEntity<String> back() {
        return ResponseEntity.ok().body("back");
    }
}
