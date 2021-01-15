package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Appointments;
import com.revature.services.AppointmentsService;

@RestController
@RequestMapping("/appointments")
public class AppointmentsController {
	
private AppointmentsService as;
	
	@Autowired
	public AppointmentsController(AppointmentsService as) {
		this.as = as;
	}
	
	@GetMapping
	public ResponseEntity<List<Appointments>> findAllAppointments(){
		
		return new ResponseEntity<List<Appointments>>(as.getAllAppointments(), HttpStatus.OK);
		
	}
	
	@GetMapping("/{companyId}")
	public ResponseEntity<List<Appointments>> findAppointmentsByCompanyId(@PathVariable int companyId){
		return new ResponseEntity<List<Appointments>>(as.getAppointmentsByCompanyId(companyId), HttpStatus.OK);
	}
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<List<Appointments>> findAppointmentsByCustomerId(@PathVariable int customerId){
		return new ResponseEntity<List<Appointments>>(as.getAppointmentsByCustomerId(customerId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Appointments> saveNewAppointment(@RequestBody Appointments a){
		
		return new ResponseEntity<Appointments>(as.saveAppointment(a), HttpStatus.OK);
		
	}
	
	
	@PutMapping
	public void UpdateAppointments(@RequestParam boolean appointmentConfirmed, @RequestParam int appointmentId){
		
	 as.updateAppointment(appointmentConfirmed, appointmentId);
		
	}

}
