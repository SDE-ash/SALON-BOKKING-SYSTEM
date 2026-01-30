package com.barber.salon.service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salon-api/v1/home")
public class HomeController {

    @GetMapping
    public String salonHealthCheck() {
        return "Salon Service is up and running!";
    }
}
