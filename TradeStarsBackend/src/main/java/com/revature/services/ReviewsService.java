package com.revature.services;

import java.util.List;

import com.revature.model.Reviews;

public interface ReviewsService {
	
	public List<Reviews> findReviewsByCompanyId(int companyId);
	
	
	public Reviews saveReviews(Reviews saveReviews);
	
	
	public List<Reviews> findAllReviews();

}
