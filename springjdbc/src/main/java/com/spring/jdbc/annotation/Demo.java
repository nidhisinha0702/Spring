package com.spring.jdbc.annotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Annotation config.........");
		 ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		 StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
	        
	        Student student = new Student();
//	        student.setId(699);
//	        student.setName("Barney");
//            student.setCity("NYC");
//	        int result = studentDao.insert(student);
//	        System.out.println("inserted student::"+result);
	        
	        //update
			
//			  student.setId(456); //id of the person whose data to be updated
//			 student.setName("Raj Kumar"); 
//			 student.setCity("LA"); 
//			 int result=studentDao.change(student); 
//			 System.out.println("data changed"+result);
			
		//delete
		
//		 int result=studentDao.delete(600); 
//		 System.out.println("deleted "+result);
		 
		
		//select single data
//		Student student = studentDao.getStudent(456);
//		System.out.println("selecting single student "+student);
		 
		//select all data
		
		List<Student> students = studentDao.getAllStudents();
		for(Student s:students) {
			System.out.println(s);
		}

	}

}
