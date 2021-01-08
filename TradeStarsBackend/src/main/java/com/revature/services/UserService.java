package com.revature.services;

import com.revature.models.User;

public interface UserService {
	
	public User saveUsers(User addUser);
	
	public User findUserById(int id);
	
	public User findUserByName(String name);
	
	public User findByRole(int UserRole);

}
