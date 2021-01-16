package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.ServiceTypes;
import com.revature.model.Services;
import com.revature.repositories.IServiceOffering;
import com.revature.repositories.IServiceTypes;

@Service
public class ServiceOfferingServiceImplementation implements ServiceOfferingService {
	
	private IServiceOffering so;
	private IServiceTypes st;
	
	@Autowired
	public ServiceOfferingServiceImplementation(IServiceOffering so, IServiceTypes st) {
		this.so = so;
		this.st = st;
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

	@Override
	public List<ServiceTypes> getAllServiceTypes() {
		return st.findAll();
	}

}
