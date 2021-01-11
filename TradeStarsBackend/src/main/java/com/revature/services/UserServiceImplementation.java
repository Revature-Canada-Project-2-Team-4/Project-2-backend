package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserDao;

@Service
public class UserServiceImplementation implements UserService {
	
	private UserDao ud;
	
	@Autowired
	 public UserServiceImplementation(UserDao ud ) {
		
		this.ud = ud;
	}
	
	
	@Override
	public List<User> findAllUsers() {
		
		return ud.findAll();
		
	}
	
	

	@Override
	public User saveUsers(User addUser) {
		return ud.saveAndFlush(addUser);
	}

	@Override
	public User findUserById(int id) {
		return ud.getOne(id);
	}

	
	
	
	
	
	

//	@Override
//	public User findUserByName(String username) {
//		return ud.findUserByName(username);
//	}

//	@Override
//	public User findByRole(int userRole) {
//		return ud.findUserByRole(userRole);
//	}

}
