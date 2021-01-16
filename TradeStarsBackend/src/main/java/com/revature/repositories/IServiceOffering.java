package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Services;

@Repository
public interface IServiceOffering extends JpaRepository<Services, Integer> {
	// public List<Services> findServicesByType(String type);
}
