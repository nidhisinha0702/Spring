package com.springrest.springrestdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springrest.springrestdata.controller.MyController;

@SpringBootApplication
public class SpringrestdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestdataApplication.class, args);
	}

}
