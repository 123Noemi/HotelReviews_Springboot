package com.challenge.hotelReviewSpringboot.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel {
	@Id
	@Column(name = "ID")
	private String id;
	private String name;
	private String description;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private int price;
	private int totalPrice;
	private float average;
	private String id_location;
	private String id_hotel;

	public Hotel() {
		super();
	}



	public Hotel(String id, String name, String description, LocalDate checkIn, LocalDate checkOut, int price,
			int totalPrice, float average, String id_location, String id_hotel) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.price = price;
		this.totalPrice = totalPrice;
		this.average = average;
		this.id_location = id_location;
		this.id_hotel = id_hotel;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}


	public LocalDate getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice() {
		long days=ChronoUnit.DAYS.between(this.getCheckIn(),this.getCheckOut());
	    int totalPrice=(int)days*this.price;
	    this.totalPrice = totalPrice;
	}


	public float getAverage() {
		return average;
	}


	public void setAverage(float average) {
		this.average = average;
	}
	

	public String getId_location() {
		return id_location;
	}

	public void setId_location(String id_location) {
		this.id_location = id_location;
	}

	public String getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(String id_hotel) {
		this.id_hotel = id_hotel;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", description=" + description + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + ", price=" + price + ", totalPrice=" + totalPrice + ", average=" + average
				+ ", id_location=" + id_location + ", id_hotel=" + id_hotel + "]";
	}


}
