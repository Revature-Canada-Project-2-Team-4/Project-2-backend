package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repositories.IUser;

@Service
public class AuthServiceImplementation implements AuthService {
	
	IUser ud;
	
	@Autowired
	 public AuthServiceImplementation(IUser ud ) {
		this.ud = ud;
	}
	
	public Users loginWithUsernameAndPassword(Users u) {
		return ud.findUsersByUsernameAndPassword(u.getUsername(), u.getPassword());
	};

}
