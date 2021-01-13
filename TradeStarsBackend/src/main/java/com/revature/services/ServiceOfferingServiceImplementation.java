package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Services;
import com.revature.repositories.IServiceOffering;

@Service
public class ServiceOfferingServiceImplementation implements ServiceOfferingService {
	
	private IServiceOffering so;
	
	@Autowired
	public ServiceOfferingServiceImplementation(IServiceOffering so) {
		this.so = so;
	}

	@Override
	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		return so.findAll();
	}

	@Override
	public List<Services> getServicesByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Services> getServicesByCompanyId(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Services> getServicesById(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
