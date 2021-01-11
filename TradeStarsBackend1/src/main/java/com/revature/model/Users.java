package com.revature.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Users {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "user_role_id")
	private UserRoles userRole;
	
	@Column(name = "email")
	private String email;
	
	
	
	public Users() {
		
	}



	public Users(int userId, String firstName, String lastName, String username, String password, UserRoles userRole,
			String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", userRole=" + userRole + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	     
	

}



