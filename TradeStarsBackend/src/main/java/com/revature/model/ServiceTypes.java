package com.revature.model;



import javax.persistence.*;

@Entity
public class ServiceTypes {

    @Id
    @Column(name = "service_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    @Column(name = "service_type")
    private String serviceType;

	public ServiceTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceTypes(int serviceId, String serviceType) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "ServiceTypes [serviceId=" + serviceId + ", serviceType=" + serviceType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + serviceId;
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceTypes other = (ServiceTypes) obj;
		if (serviceId != other.serviceId)
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		return true;
	}
    
    
    
    

}
