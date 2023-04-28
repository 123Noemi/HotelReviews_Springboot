package com.challenge.hotelReviewSpringboot.service;

import java.util.List;

import com.challenge.hotelReviewSpringboot.model.Hotel;


public interface IHotelReviewsService {
	public List<Hotel> findAll();
}
