package com.spring.foodservice.springrestfoodservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.foodservice.springrestfoodservice.entities.FoodTruck;
import com.spring.foodservice.springrestfoodservice.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	FoodService foodService;

	@GetMapping("/food")
	public List<FoodTruck> getFoodTruckDetails(@RequestBody Map<String,String> input) {
		return this.foodService.getFoodTruck(input);
	}
}
