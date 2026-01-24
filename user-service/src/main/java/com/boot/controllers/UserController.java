package com.boot.controllers;

import com.boot.entity.User;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user-service/api/v1")
public class UserController {

    @GetMapping("/getuser")
    public User getUser() {
        return User.builder()
                .fullName("John Doe")
                .email("johndoe@gmail.com")
                .phoneNo("1234567890")
                .role("ADMIN")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
