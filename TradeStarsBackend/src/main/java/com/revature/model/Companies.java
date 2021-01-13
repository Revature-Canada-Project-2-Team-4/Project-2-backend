package com.revature.model;



import javax.persistence.*;

@Entity
public class Companies {
    @Id
    @Column(name = "company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_type")
    private String companyType;
    
    @Column(name = "comapny_address")
    private String companyAddress;
    
    


    @ManyToOne
    @JoinColumn(name = "company_owner", referencedColumnName = "user_id")
    private Users companyOwner;

	public Companies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Companies(int companyId, String companyName, String companyType, Users companyOwner) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyType = companyType;
		this.companyOwner = companyOwner;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public Users getCompanyOwner() {
		return companyOwner;
	}

	public void setCompanyOwner(Users companyOwner) {
		this.companyOwner = companyOwner;
	}

	@Override
	public String toString() {
		return "Companies [companyId=" + companyId + ", companyName=" + companyName + ", companyType=" + companyType
				+ ", companyOwner=" + companyOwner + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyId;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyOwner == null) ? 0 : companyOwner.hashCode());
		result = prime * result + ((companyType == null) ? 0 : companyType.hashCode());
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
		Companies other = (Companies) obj;
		if (companyId != other.companyId)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyOwner == null) {
			if (other.companyOwner != null)
				return false;
		} else if (!companyOwner.equals(other.companyOwner))
			return false;
		if (companyType == null) {
			if (other.companyType != null)
				return false;
		} else if (!companyType.equals(other.companyType))
			return false;
		return true;
	}

	
    
    
}
