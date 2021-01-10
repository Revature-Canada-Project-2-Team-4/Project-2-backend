package com.revature.services;

import java.util.List;

import com.revature.models.User;

public interface UserService {
	
	
	public  List<User> findAllUsers();
	public User saveUsers(User addUser);
	
	public User findUserById(int id);
	
	
	//public User findUserByName(String username);
	
	//public User findByRole(int UserRole);

}
