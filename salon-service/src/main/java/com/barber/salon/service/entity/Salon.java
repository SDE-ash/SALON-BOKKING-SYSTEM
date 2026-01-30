package com.barber.salon.service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long salonId;

    @Column(nullable = false)
    private  String name;

    @ElementCollection
    private List<String> images;

    @Column(nullable = false)
    private String address;

    @NotBlank(message = "phone number cannot be empty")
    @Column(nullable = false)
    private String phoneNo;

    @Email(message = "email cannot be empty")
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String city;

    private Long ownerId;

    private LocalDateTime openingTime;

    private LocalDateTime closingTime;

}
