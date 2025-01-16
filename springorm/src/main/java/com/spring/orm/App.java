package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student(2324,"Nidhi Kumari","cincinnati");
//        int r = studentDao.insert(student);
//        System.out.println("done:::"+r);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while(go) {
        System.out.println("PRESS 1 for ass new student");
        System.out.println("PRESS 2 for display all students");
        System.out.println("PRESS 3 for get detail of single student");
        System.out.println("PRESS 4 for delete student");
        System.out.println("PRESS 5 for update student");
        System.out.println("PRESS 6 for exit");
        
        try {
        	int input = Integer.parseInt(br.readLine());
        	switch(input) {
        	case 1:
        		//add a new student
        		break;
        	case 2:
        		//display all student
        		break;
        	case 3:
        		//get single student data
        		break;
        	case 4:
        		//delete student
        		break;
        	case 5:
        		//update student
        		break;
        	case 6:
        		//exit
        		go=false;
        		break;
        		
        	}
        	
        }catch(Exception e) {
        	System.out.println("Invalid input try with another one !!");
        	System.out.println(e.getMessage());
        }
        }System.out.println("Thank you for using my application");
        System.out.println("see you soon");
    }
}
