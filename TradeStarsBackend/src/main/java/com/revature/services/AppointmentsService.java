package com.revature.services;

import java.util.List;

import com.revature.model.Appointments;

public interface AppointmentsService {
	
	public List<Appointments> getAppointmentsByCustomer();
	public List<Appointments> getAppointmentsByCompanyId(int companyId);
	public List<Appointments> getAllAppointments();
	public Appointments saveAppointment(Appointments a); 
	public void updateAppointment(boolean appointmentConfirmed, int appointmentId);
}
