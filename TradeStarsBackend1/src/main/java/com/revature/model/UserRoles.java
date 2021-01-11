package com.revature.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserRoles {

    @Id
    @Column(name = "user_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Column(name = "user_role")
    private String userRole;
    
    
    public UserRoles() {
		// TODO Auto-generated constructor stub
	}


	public UserRoles(int roleId, String userRole) {
		super();
		this.roleId = roleId;
		this.userRole = userRole;
	}


	@Override
	public String toString() {
		return "UserRoles [roleId=" + roleId + ", userRole=" + userRole + "]";
	}
	
	
	
	
    
    
    
    
    
}
