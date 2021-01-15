package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Companies;
import com.revature.model.Users;
import com.revature.repositories.ICompanies;

@Service
public class CompaniesServiceImplementation implements CompaniesService {
	
	ICompanies comp;
	
	@Autowired
	public CompaniesServiceImplementation(ICompanies comp) {
		this.comp = comp;
	}

	@Override
	public Companies saveCompany(Companies saveComp) {
		
		return comp.saveAndFlush(saveComp);
	}

	@Override
	public Companies findCompanyById(int id) {
		return null;
	}

	@Override
	public List<Companies> findAllCompany() {
		
		return comp.findAll();
	}

	@Override
	public Companies findCompanyByOwner(int ownerId) {
		Users u = new Users();
		u.setUserId(ownerId);
		System.out.println(ownerId);
		return comp.findCompaniesByCompanyOwner(u);
	}

}
