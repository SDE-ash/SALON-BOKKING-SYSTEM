package com.barber.salon.service.entity;

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
public class Salon {

    private Long salonId;

    private  String name;

    private List<String> images;

    private String address;

    private String phoneNo;


    private String email;

    private String city;

    private Long ownerId;

    private LocalDateTime openingTime;

    private LocalDateTime closingTime;

}
