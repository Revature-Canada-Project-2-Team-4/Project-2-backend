package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.services.UserService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {

	
	private UserService us;	
	
	@Autowired
	public UserController(UserService us) {
			this.us = us;
	}
	
	

	@GetMapping
	public ResponseEntity<List<User>> findAllUsers(){
		
		System.out.println(us.findAllUsers());
		
		//Here we call database to get data 
		return new ResponseEntity<List<User>>(us.findAllUsers(), HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable int id){
		
		//Here we call database to get data 
		return new ResponseEntity<User>(us.findUserById(id), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<User> saveNewUser(@RequestBody User u){
		//Here we call database to get data 
		return new ResponseEntity<User>(us.saveUsers(u), HttpStatus.CREATED);
		
	}
}
