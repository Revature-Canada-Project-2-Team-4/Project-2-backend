package com.revature.services;

import java.util.List;

import com.revature.model.Reviews;

public interface ReviewsService {
	
	
	public Reviews saveReviews(Reviews saveReviews);
	
	
	public List<Reviews> findAllReviews();

}
