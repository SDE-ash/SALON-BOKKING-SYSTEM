package com.barber.salon.service.repo;

import com.barber.salon.service.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepo extends JpaRepository<Salon, Long> {

}
