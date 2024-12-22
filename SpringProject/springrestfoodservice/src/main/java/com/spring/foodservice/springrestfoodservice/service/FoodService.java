package com.spring.foodservice.springrestfoodservice.service;

import java.util.List;
import java.util.Map;

import com.spring.foodservice.springrestfoodservice.entities.FoodTruck;

public interface FoodService {
	public List<FoodTruck> getFoodTruck(Map<String,String> input);
}
