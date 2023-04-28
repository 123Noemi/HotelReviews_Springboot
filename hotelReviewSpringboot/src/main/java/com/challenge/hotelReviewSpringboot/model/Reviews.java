package com.challenge.hotelReviewSpringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "REVIEWS")
public class Reviews {
	@Id
	@Column(name = "ID_REVIEW")
	private String id;
	private int rating;
	private String comment;
	
	public Reviews(String id, int rating, String comment) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", comment=" + comment + "]";
	}

}
