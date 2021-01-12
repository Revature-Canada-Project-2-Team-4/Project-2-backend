package com.revature.model;



import javax.persistence.*;
import java.util.Date;


@Entity
public class Appointments {

    @Id
    @Column(name = "appointment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users customerId;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies companyId;

    @Column(name = "appointment_start")
    private Date appointmentStart;

    @Column(name = "appointment_end")
    private Date appointmentEnd;

    @Column(name = "appointment_confirmed")
    private boolean appointmentConfirmed;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services forService;

    @Column(name = "appointment_completed")
    private boolean appointmentCompleted;

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(int appointmentId, Users customerId, Companies companyId, Date appointmentStart,
			Date appointmentEnd, boolean appointmentConfirmed, Services forService, boolean appointmentCompleted) {
		super();
		this.appointmentId = appointmentId;
		this.customerId = customerId;
		this.companyId = companyId;
		this.appointmentStart = appointmentStart;
		this.appointmentEnd = appointmentEnd;
		this.appointmentConfirmed = appointmentConfirmed;
		this.forService = forService;
		this.appointmentCompleted = appointmentCompleted;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Users getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Users customerId) {
		this.customerId = customerId;
	}

	public Companies getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Companies companyId) {
		this.companyId = companyId;
	}

	public Date getAppointmentStart() {
		return appointmentStart;
	}

	public void setAppointmentStart(Date appointmentStart) {
		this.appointmentStart = appointmentStart;
	}

	public Date getAppointmentEnd() {
		return appointmentEnd;
	}

	public void setAppointmentEnd(Date appointmentEnd) {
		this.appointmentEnd = appointmentEnd;
	}

	public boolean isAppointmentConfirmed() {
		return appointmentConfirmed;
	}

	public void setAppointmentConfirmed(boolean appointmentConfirmed) {
		this.appointmentConfirmed = appointmentConfirmed;
	}

	public Services getForService() {
		return forService;
	}

	public void setForService(Services forService) {
		this.forService = forService;
	}

	public boolean isAppointmentCompleted() {
		return appointmentCompleted;
	}

	public void setAppointmentCompleted(boolean appointmentCompleted) {
		this.appointmentCompleted = appointmentCompleted;
	}

	@Override
	public String toString() {
		return "Appointments [appointmentId=" + appointmentId + ", customerId=" + customerId + ", companyId="
				+ companyId + ", appointmentStart=" + appointmentStart + ", appointmentEnd=" + appointmentEnd
				+ ", appointmentConfirmed=" + appointmentConfirmed + ", forService=" + forService
				+ ", appointmentCompleted=" + appointmentCompleted + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (appointmentCompleted ? 1231 : 1237);
		result = prime * result + (appointmentConfirmed ? 1231 : 1237);
		result = prime * result + ((appointmentEnd == null) ? 0 : appointmentEnd.hashCode());
		result = prime * result + appointmentId;
		result = prime * result + ((appointmentStart == null) ? 0 : appointmentStart.hashCode());
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((forService == null) ? 0 : forService.hashCode());
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
		Appointments other = (Appointments) obj;
		if (appointmentCompleted != other.appointmentCompleted)
			return false;
		if (appointmentConfirmed != other.appointmentConfirmed)
			return false;
		if (appointmentEnd == null) {
			if (other.appointmentEnd != null)
				return false;
		} else if (!appointmentEnd.equals(other.appointmentEnd))
			return false;
		if (appointmentId != other.appointmentId)
			return false;
		if (appointmentStart == null) {
			if (other.appointmentStart != null)
				return false;
		} else if (!appointmentStart.equals(other.appointmentStart))
			return false;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (forService == null) {
			if (other.forService != null)
				return false;
		} else if (!forService.equals(other.forService))
			return false;
		return true;
	}
    
    
    
}
