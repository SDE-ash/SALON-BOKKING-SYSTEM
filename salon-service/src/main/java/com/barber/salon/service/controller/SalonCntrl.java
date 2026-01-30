package com.barber.salon.service.controller;

import com.barber.salon.service.entity.Salon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/salons/api/v1/")
public class SalonCntrl {


    @GetMapping("/{salonId}")
    public ResponseEntity<Salon> getSalonById(@PathVariable Long salonId) {
        // Implementation goes here
        return new ResponseEntity<>(Salon.builder()
                .email("salon@tech.com")
                .phoneNo("92820202")
                .city("Nagpur")
                .address("MAHA NGP")
                .name("Bhikari salon")
                .ownerId(2010L)
                .openingTime(LocalDateTime.now())
                .openingTime(LocalDateTime.now())
                .build(), HttpStatus.OK);
    }


    @PostMapping("/add-salon")
    public ResponseEntity<String> saveSalon(@RequestBody Salon salon) {
        // Implementation goes here
        return new ResponseEntity<>("Salon saved successfully", HttpStatus.CREATED);
    }


}
