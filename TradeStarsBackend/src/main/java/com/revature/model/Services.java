package com.revature.model;



import javax.persistence.*;

@Entity
public class Services {

    @Id
    @Column(name = "service_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    @ManyToOne
    @JoinColumn(name = "service_type")
    private ServiceTypes serviceTypes;

    @Column(name = "service_price")
    private int servicePrice;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies providedBy;

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(int serviceId, ServiceTypes serviceTypes, int servicePrice, Companies providedBy) {
		super();
		this.serviceId = serviceId;
		this.serviceTypes = serviceTypes;
		this.servicePrice = servicePrice;
		this.providedBy = providedBy;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public ServiceTypes getServiceTypes() {
		return serviceTypes;
	}

	public void setServiceTypes(ServiceTypes serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

	public int getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(int servicePrice) {
		this.servicePrice = servicePrice;
	}

	public Companies getProvidedBy() {
		return providedBy;
	}

	public void setProvidedBy(Companies providedBy) {
		this.providedBy = providedBy;
	}

	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", serviceTypes=" + serviceTypes + ", servicePrice=" + servicePrice
				+ ", providedBy=" + providedBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((providedBy == null) ? 0 : providedBy.hashCode());
		result = prime * result + serviceId;
		result = prime * result + servicePrice;
		result = prime * result + ((serviceTypes == null) ? 0 : serviceTypes.hashCode());
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
		Services other = (Services) obj;
		if (providedBy == null) {
			if (other.providedBy != null)
				return false;
		} else if (!providedBy.equals(other.providedBy))
			return false;
		if (serviceId != other.serviceId)
			return false;
		if (servicePrice != other.servicePrice)
			return false;
		if (serviceTypes == null) {
			if (other.serviceTypes != null)
				return false;
		} else if (!serviceTypes.equals(other.serviceTypes))
			return false;
		return true;
	}
    
    

}
