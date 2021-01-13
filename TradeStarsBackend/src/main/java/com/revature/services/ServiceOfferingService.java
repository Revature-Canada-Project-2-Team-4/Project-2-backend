package com.revature.services;

import java.util.List;

import com.revature.model.Services;

public interface ServiceOfferingService {
	
	public List<Services> getAllServices();
	public List<Services> getServicesByType(String type);
	public List<Services> getServicesByCompanyId(int companyId);
	public List<Services> getServicesById(int serviceId);
	
}
