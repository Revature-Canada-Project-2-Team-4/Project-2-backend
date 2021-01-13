package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Companies;
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

}
