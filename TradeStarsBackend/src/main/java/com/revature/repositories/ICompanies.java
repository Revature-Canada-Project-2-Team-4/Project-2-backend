package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Companies;
import com.revature.model.Users;

@Repository
public interface ICompanies extends JpaRepository<Companies, Integer> {
	
	public Companies findCompaniesByCompanyOwner(Users companyOwner);

}
