package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Users;
import com.revature.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService us;
	
	@Autowired
	public UserController(UserService us) {
		this.us = us;
	}

	@GetMapping
	public ResponseEntity<List<Users>> findAllUsers(){
		
		return new ResponseEntity<List<Users>>(us.findAllUsers(), HttpStatus.OK);
		
	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<User> findUserById(@PathVariable int id){
//		User u = new User();
//		//Here we call database to get data 
//		return new ResponseEntity<User>(u, HttpStatus.OK);
//		
//	}
	
	@PostMapping
	public ResponseEntity<Users> saveNewUser(@RequestBody Users u){
		//Here we call database to get data 
		return new ResponseEntity<Users>(us.saveUsers(u), HttpStatus.CREATED);
		
	}

	}
