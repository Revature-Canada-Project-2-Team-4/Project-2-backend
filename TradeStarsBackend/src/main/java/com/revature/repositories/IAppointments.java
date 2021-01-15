package com.revature.repositories;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Appointments;
import com.revature.model.Companies;
import com.revature.model.Users;

@Repository
public interface IAppointments extends JpaRepository<Appointments, Integer> {

	public List<Appointments> findAppointmentsByCompanyId(Companies c);
	
	public List<Appointments> findAppointmentsByCustomerId(Users u);
	
	@Transactional
	@Modifying
	@Query("update Appointments a set a.appointmentConfirmed=?1 where a.appointmentId=?2")
	public void updateAppointments(boolean appointmentConfirmed, int appointmentId );

}
