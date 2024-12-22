package com.spring.foodservice.springrestfoodservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.foodservice.springrestfoodservice.entities.FoodTruck;

public interface FoodTruckDao extends JpaRepository<FoodTruck, Long> {
	List<FoodTruck> findByApplicant(String applicant);

	List<FoodTruck> findByExpirationDate(String expirationDate);

	List<FoodTruck> findByLocationDescription(String locationDescription);
}
