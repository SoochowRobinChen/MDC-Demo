package com.robinchen.MDCDemo.controller;

import com.robinchen.MDCDemo.model.User;
import com.robinchen.MDCDemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        log.info("Get creation request from client and request body info :: {}", user);
        userService.createUser(user);
        log.info("Successfully create a user!");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
