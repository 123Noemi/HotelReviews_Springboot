package com.challenge.hotelReviewSpringboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.challenge.hotelReviewSpringboot.model.Hotel;
import com.challenge.hotelReviewSpringboot.service.HotelReviewsServiceImpl;
import com.challenge.hotelReviewSpringboot.utils.Utils;

@SpringBootTest
class HotelReviewSpringbootApplicationTests {

	@Autowired
	HotelReviewsServiceImpl hotelServiceImpl;
	Utils utils=new Utils();
	LocalDate checkIn = utils.StringToLocalDate("20/05/2022");
	LocalDate checkOut = utils.StringToLocalDate("22/05/2022");
	
	
	/*@Test
    public void testValidateDates() {
        assertTrue(checkIn.isBefore(checkOut));
    }
	
	@Test
    public void testValidateDates2() {
        assertTrue(checkIn.isAfter(checkOut));
    }*/

	
	@Test
	public void testFindAll() {
		System.out.println("testFindAll");
		List<Hotel> hotelList=hotelServiceImpl.findAll();
		assertNotNull(hotelList); 
		
		for(Hotel hotel : hotelList)
		{
		    System.out.println(hotel.toString());
		}
	}
	
}
