package com.revature.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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

}
