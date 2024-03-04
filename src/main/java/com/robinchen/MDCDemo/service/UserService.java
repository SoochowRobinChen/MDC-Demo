package com.robinchen.MDCDemo.service;

import com.robinchen.MDCDemo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public void createUser(User user){
        log.info("Get user information from controller :: {}", user);
        // mock user creation in database
        log.info("User creation is successful at service layer");
    }

}
