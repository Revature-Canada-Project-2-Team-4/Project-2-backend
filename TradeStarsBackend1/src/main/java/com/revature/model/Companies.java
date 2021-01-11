package com.revature.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Companies {
    @Id
    @Column(name = "company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_type")
    private int companyType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users companyOwner;
}
