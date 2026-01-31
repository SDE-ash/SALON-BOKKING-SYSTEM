package com.barber.salon.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalonReqDTO {

    private  String name;

    private String address;

    private String phoneNo;

    private String email;

    private String city;

    private Long ownerId;

    private LocalDateTime openingTime;

    private LocalDateTime closingTime;
}
