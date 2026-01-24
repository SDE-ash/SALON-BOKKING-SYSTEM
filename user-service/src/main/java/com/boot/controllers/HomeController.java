package com.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class HomeController {

    @GetMapping("/home")
    public String homeController() {
        return "User Service is up and running";
    }
}
