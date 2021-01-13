package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Appointments;
import com.revature.repositories.IAppointments;

@Service
public class AppointmentsServiceImpl implements AppointmentsService {
	
	private IAppointments appts;
	
	@Autowired
	public AppointmentsServiceImpl(IAppointments appts) {
		this.appts = appts;
	}
	
	

	@Override
	public List<Appointments> getAppointmentsByCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointments> getAppointmentsByCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointments> getAllAppointments() {
		return appts.findAll();
	}


	@Override
	public Appointments saveAppointment(Appointments a) {
		return appts.saveAndFlush(a);
	}

}
