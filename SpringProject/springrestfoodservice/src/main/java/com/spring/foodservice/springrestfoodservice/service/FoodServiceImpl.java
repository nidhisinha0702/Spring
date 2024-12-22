package com.spring.foodservice.springrestfoodservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.foodservice.springrestfoodservice.entities.FoodTruck;
import com.spring.foodservice.springrestfoodservice.repository.FoodTruckDao;

public class FoodServiceImpl {
	
	@Autowired
	FoodTruckDao foodTruckDao;
	
	public List<FoodTruck> getFoodTruck(Map<String,String> input){
		String name="";
		String value="";
		String data="";
		for(Map.Entry<String, String> entry : input.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			int count=0;
			if(key!=null && val!=null && count<2) {
				count++;
				name=key;
				value=val;
			}
		}
		if(name.equals("applicant")) {
			data=value;
			return this.foodTruckDao.findByApplicant(data);
		}
		else if(name.equals("expirationDate")) {
			data=value;
		return this.foodTruckDao.findByExpirationDate(data);
		}
		else if(name.equals("locationDescription")) {
			data=value;
			return this.foodTruckDao.findByLocationDescription(data);
		}
		else {
			return null;
		}
	}
}
