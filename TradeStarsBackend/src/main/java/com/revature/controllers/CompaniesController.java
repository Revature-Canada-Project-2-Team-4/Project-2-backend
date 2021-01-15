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

import com.revature.model.Companies;
import com.revature.services.CompaniesService;

@RestController
@RequestMapping("/companies")
public class CompaniesController {
	
	private CompaniesService companyServ;
	
	@Autowired
	public CompaniesController(CompaniesService companyServ) {
		
		this.companyServ = companyServ;
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Companies>> findAllUsers(){
		return new ResponseEntity<List<Companies>>(companyServ.findAllCompany(), HttpStatus.OK);
	}
	
	@GetMapping("/{companyOwner}")
	public ResponseEntity<Companies> findCompanyByOwner(@PathVariable int companyOwner){
		return new ResponseEntity<Companies>(companyServ.findCompanyByOwner(companyOwner), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Companies> saveNewUser(@RequestBody Companies comp){
		//Here we call database to get data 
		return new ResponseEntity<Companies>(companyServ.saveCompany(comp), HttpStatus.CREATED);
	}


}
