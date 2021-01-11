package com.revature.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Reviews {

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    @Column(name = "review_text")
    private String reviewText;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies reviewedBy;

    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private Users reviewedFor;

}
