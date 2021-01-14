package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Appointments;
import com.revature.model.Companies;
import com.revature.model.Users;

@Repository
public interface IAppointments extends JpaRepository<Appointments, Integer> {
	
	public List<Appointments> findAppointmentsByCompanyId(Companies c);
}
