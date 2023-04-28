package com.challenge.hotelReviewSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.hotelReviewSpringboot.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
}
