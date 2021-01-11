package com.revature.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
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
}
