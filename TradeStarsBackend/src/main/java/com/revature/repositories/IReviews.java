package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Reviews;

@Repository
public interface IReviews extends JpaRepository<Reviews, Integer> {

}
