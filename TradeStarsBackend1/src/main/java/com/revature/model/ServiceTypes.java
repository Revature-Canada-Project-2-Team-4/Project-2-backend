package com.revature.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ServiceTypes {

    @Id
    @Column(name = "service_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    @Column(name = "service_type")
    private String serviceType;

}
