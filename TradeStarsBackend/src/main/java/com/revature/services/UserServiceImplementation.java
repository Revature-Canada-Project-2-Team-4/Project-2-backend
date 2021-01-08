package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.UserDao;

public class UserServiceImplementation implements UserService {
	
	private UserDao ud;
	
	 public UserServiceImplementation(UserDao ud ) {
		
		this.ud = ud;
	}

	@Override
	public User saveUsers(User addUser) {
		return ud.saveAndFlush(addUser);
	}

	@Override
	public User findUserById(int id) {
		return ud.getOne(id);
	}

	@Override
	public User findUserByName(String name) {
		return ud.findUserByName(name);
	}

	@Override
	public User findByRole(int userRole) {
		return ud.findUserByRole(userRole);
	}

}
