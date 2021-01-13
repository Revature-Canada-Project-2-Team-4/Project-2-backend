package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Reviews;
import com.revature.services.ReviewsService;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {
	
	private ReviewsService reviewService;
	
	
	@Autowired
	public ReviewsController(ReviewsService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping
	public ResponseEntity<List<Reviews>> findAllUsers(){
		
		return new ResponseEntity<List<Reviews>>(reviewService.findAllReviews(), HttpStatus.OK);
		
	}
	
	
	@PostMapping
	public ResponseEntity<Reviews> saveNewUser(@RequestBody Reviews review){
		//Here we call database to get data 
		return new ResponseEntity<Reviews>(reviewService.saveReviews(review), HttpStatus.CREATED);
		
	}


}
