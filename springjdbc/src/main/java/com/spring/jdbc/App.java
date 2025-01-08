package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started.........!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        	
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        Student student = new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("NYC");
//        int result = studentDao.insert(student);
      		//StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		//insert
		/*
		 * Student student = new Student(); student.setId(666); student.setName("John");
		 * student.setCity("Lucknow");
		 * 
		 * int result = studentDao.insert(student); System.out.println(result);
		 */
        //update
			
//			  student.setId(600); //id of the person whose data to be updated
//			 student.setName("Raj Kumar"); 
//			 student.setCity("Lucknow"); 
//			 int result=studentDao.change(student); 
//			 System.out.println("data changed"+result);
			
		//delete
		
//		 int result=studentDao.delete(600); 
//		 System.out.println("deleted "+result);
		 
		
		//select single data
		/*
		 * Student student = studentDao.getStudent(456);
		 * System.out.println("selecting single student "+student);
		 */
		//select all data
		
		//List<Student> students = studentDao.getAllStudents();
//		for(Student s:students) {
//			System.out.println(s);
//		}
    }
}
