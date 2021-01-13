package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Appointments;

@Repository
public interface IAppointments extends JpaRepository<Appointments, Integer> {
	
}
