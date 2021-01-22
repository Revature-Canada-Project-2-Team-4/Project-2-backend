package com.revature.services;

import java.util.List;

import com.revature.model.Companies;

public interface CompaniesService {
	
	public Companies saveCompany(Companies saveComp);
	
	public Companies findCompanyById(int id);
	
	public Companies findCompanyByOwner(int ownerId);
	
	public List<Companies> findAllCompany();


}
