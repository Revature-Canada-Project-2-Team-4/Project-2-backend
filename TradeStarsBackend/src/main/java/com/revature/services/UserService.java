package com.revature.services;

import java.util.List;

import com.revature.model.Users;

public interface UserService {
	
	public Users saveUsers(Users addUsers);
	
	public Users findUserById(int id);
	
	public List<Users> findAllUsers();

	
//	public Users findUserByName(String name);
//	
//	public Users findByRole(int UserRole);

}
