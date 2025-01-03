package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress().getClass().getName());
		Student student2 = context.getBean("ob",Student.class);
		Teacher t1 = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println("++++++++++++++++++++");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
