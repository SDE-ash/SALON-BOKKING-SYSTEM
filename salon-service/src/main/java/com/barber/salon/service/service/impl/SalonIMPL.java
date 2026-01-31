package com.barber.salon.service.service.impl;

import com.barber.salon.service.dto.SalonReqDTO;
import com.barber.salon.service.dto.UserDTO;
import com.barber.salon.service.entity.Salon;
import com.barber.salon.service.repo.SalonRepo;
import com.barber.salon.service.service.SalonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SalonIMPL implements SalonServices {

    @Autowired
    private SalonRepo salonRepo;

    @Override
    public Salon createSalon(SalonReqDTO salon, UserDTO user) {
        return null;
    }

    @Override
    public Salon updateSalon(SalonReqDTO salon, Long salonId, UserDTO user) {
        return null;
    }

    @Override
    public List<Salon> getAllSalons() {
        return List.of();
    }

    @Override
    public Salon getSalonById(Long salonId) {
        return null;
    }

    @Override
    public Salon getSalonByOwnerId(Long ownerId) {
        return null;
    }

    @Override
    public List<Salon> searchSalonsByCity(String city) {
        return List.of();
    }
}
