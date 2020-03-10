package com.example.springtest.controllers;

import com.example.springtest.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u1 = new User(1L, "testName", "test@test.com", "(11)1111-1111", "1111");
        return ResponseEntity.ok().body(u1);
    }
}
