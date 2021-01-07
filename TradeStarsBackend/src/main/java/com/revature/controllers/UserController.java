package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ResponseEntity<List<User>> findAllUsers(){
		List<User> ul = new ArrayList<User>();
		//Here we call database to get data 
		return new ResponseEntity<List<User>>(ul, HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable int id){
		User u = new User();
		//Here we call database to get data 
		return new ResponseEntity<User>(u, HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<User> saveNewUser(@RequestBody User u){
		//Here we call database to get data 
		return new ResponseEntity<User>(u, HttpStatus.CREATED);
		
	}
}
