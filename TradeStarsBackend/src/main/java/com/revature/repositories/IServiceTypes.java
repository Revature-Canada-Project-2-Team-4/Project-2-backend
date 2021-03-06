package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.ServiceTypes;

@Repository
public interface IServiceTypes extends JpaRepository<ServiceTypes, Integer> {

}
