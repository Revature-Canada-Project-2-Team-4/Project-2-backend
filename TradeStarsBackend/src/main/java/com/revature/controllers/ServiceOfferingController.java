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

import com.revature.model.ServiceTypes;
import com.revature.model.Services;
import com.revature.model.Users;
import com.revature.services.ServiceOfferingService;

@RestController
@RequestMapping("/offerings")
public class ServiceOfferingController {
	
	private ServiceOfferingService sos;
	
	@Autowired
	public ServiceOfferingController(ServiceOfferingService sos) {
		this.sos = sos;
	}
	
	@GetMapping
	public ResponseEntity<List<Services>> findAllServices(){
		
		return new ResponseEntity<List<Services>>(sos.getAllServices(), HttpStatus.OK);
		
	}
	
	@GetMapping("/types")
	public ResponseEntity<List<ServiceTypes>> findAllServiceTypes(){
		
		return new ResponseEntity<List<ServiceTypes>>(sos.getAllServiceTypes(), HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<Services> saveNewUser(@RequestBody Services service){
		//Here we call database to get data 
		return new ResponseEntity<Services>(sos.saveServices(service), HttpStatus.CREATED);
		
	}
}
