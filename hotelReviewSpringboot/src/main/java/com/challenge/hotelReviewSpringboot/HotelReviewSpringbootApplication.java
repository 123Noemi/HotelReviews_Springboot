package com.challenge.hotelReviewSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(basePackages = {"com.challenge.hotelReviewSpringboot.model", "com.challenge.hotelReviewSpringboot.utils"})
@ComponentScan(basePackages = {"com.challenge.hotelReviewSpringboot.repository", "com.challenge.hotelReviewSpringboot.utils"})
@ComponentScan(basePackages = {"com.challenge.hotelReviewSpringboot.service", "com.challenge.hotelReviewSpringboot.utils"})
@ComponentScan(basePackages = {"com.challenge.hotelReviewSpringboot.utils", "com.challenge.hotelReviewSpringboot.utils"})
*/public class HotelReviewSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReviewSpringbootApplication.class, args);
	}

}
