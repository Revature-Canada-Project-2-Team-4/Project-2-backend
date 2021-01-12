package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repositories.IUser;

@Service
public class UserServiceImplementation implements UserService {
	
	IUser ud;
	
	@Autowired
	 public UserServiceImplementation(IUser ud ) {
		
		this.ud = ud;
	}

	@Override
	public Users saveUsers(Users addUsers) {
		return ud.saveAndFlush(addUsers);
	}

	@Override
	public Users findUserById(int id) {
		return ud.getOne(id);
	}

	@Override
	public List<Users> findAllUsers() {
		return ud.findAll();
	}

//	@Override
//	public Users findUserByName(String name) {
//		//return ud.findUserByName(name);
//	 return new Users();
//	 }
//
//	@Override
//	public Users findByRole(int userRole) {
//		//return ud.findUserByRole(userRole);
//		return new Users();
//	}

}
