package com.spring.jdbc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Annotation config.........");
		 ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

	}

}
