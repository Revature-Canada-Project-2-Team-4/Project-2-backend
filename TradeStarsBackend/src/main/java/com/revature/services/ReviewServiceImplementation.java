package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Reviews;
import com.revature.repositories.IReviews;

@Service
public class ReviewServiceImplementation implements ReviewsService {
	
	IReviews reviews;
	
	@Autowired
	public ReviewServiceImplementation(IReviews reviews) {
		this.reviews = reviews;
		
	}

	@Override
	public Reviews saveReviews(Reviews saveReviews) {
		return reviews.saveAndFlush(saveReviews);
	}

	@Override
	public List<Reviews> findAllReviews() {
		
		return reviews.findAll();
		
	}

}
