package com.barber.salon.service.repo;

import com.barber.salon.service.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalonRepo extends JpaRepository<Salon, Long> {

    Salon findByOwnerId(Long ownerId);


  //  @Query("SELECT S FROM Salon s WHERE" + "(LOWER(s.city) LIKE lower(concat('%', :keyword, '%')) OR "  )
    //List<Salon> seacrhSalonByKeyword(@Param("keyword") String keyword);
}
