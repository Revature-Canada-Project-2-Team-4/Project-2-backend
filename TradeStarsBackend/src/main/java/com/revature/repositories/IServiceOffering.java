package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Services;

public interface IServiceOffering extends JpaRepository<Services, Integer> {

}
