package com.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/")
    public ResponseEntity<String> getAllPersons() {
        return ResponseEntity.ok("This is basic spring boot app");
    }
}
