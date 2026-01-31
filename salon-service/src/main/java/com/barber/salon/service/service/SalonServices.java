package com.barber.salon.service.service;

import com.barber.salon.service.dto.SalonReqDTO;
import com.barber.salon.service.dto.UserDTO;
import com.barber.salon.service.entity.Salon;

import java.util.List;

public interface SalonServices {

    Salon createSalon(SalonReqDTO salon, UserDTO user);

    Salon updateSalon(SalonReqDTO salon, Long salonId, UserDTO user);

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonsByCity(String city);
}
