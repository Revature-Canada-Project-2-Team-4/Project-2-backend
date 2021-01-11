package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Users;
import org.springframework.stereotype.Repository;


public interface IUser extends JpaRepository<Users, Integer> {

	//User findUserByName(String name);
	//User findUserByRole(int userRole);

}