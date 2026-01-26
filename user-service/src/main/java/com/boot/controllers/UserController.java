package com.boot.controllers;

import com.boot.entity.User;
import com.boot.services.UserServices;
import jakarta.validation.Valid;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user-service/api/v1")
public class UserController {

    @Autowired
    private UserServices userServices;

//    @GetMapping("/getuser")
//    public User getUser() {
//        return User.builder()
//                .fullName("John Doe")
//                .email("johndoe@gmail.com")
//                .phoneNo("1234567890")
//                .role("ADMIN")
//                .createdAt(LocalDateTime.now())
//                .updatedAt(LocalDateTime.now())
//                .build();
//    }

    @PostMapping("/createuser")
    public String createUser(@Valid @RequestBody User user) {
        try{
            userServices.saveUser(user);
            return "User created successfully";
        }catch (Exception e){
            return "Failed to create user: " + e.getMessage();
        }
    }

    @GetMapping("/getUser")
    public User getUserById(@RequestParam String email){
        return userServices.getUserByEmail(email);
    }

    @GetMapping("/userbyphone")
    public User getUserByPhoneNo(@RequestParam String phoneNo){
        return userServices.getUserByPhoneNo(phoneNo);
    }

    @PutMapping("/updateuser")
    public String updateUser(@RequestParam String email, @RequestBody User updtUser){
        return userServices.updateUser(email, updtUser);
    }
}
