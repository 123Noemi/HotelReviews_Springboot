package com.challenge.hotelReviewSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.hotelReviewSpringboot.model.Hotel;
import com.challenge.hotelReviewSpringboot.repository.HotelRepository;


@Service
public class HotelReviewsServiceImpl implements IHotelReviewsService {
	@Autowired
	private HotelRepository hotelRepo;

	@Override
	public List<Hotel> findAll() {
		return hotelRepo.findAll();
	}
	

}
