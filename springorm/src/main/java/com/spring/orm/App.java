package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

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
        		System.out.println("Enter user id: ");
        		int uid = Integer.parseInt(br.readLine());
        		System.out.println("Enter user name:");
        		String uName = br.readLine();
        		System.out.println("Enter user city:");
        		String uCity = br.readLine();
        		
        		Student s = new Student();
        		s.setStudentId(uid);
        		s.setStudentName(uName);
        		s.setStudentCity(uCity);
        		//it returns the id of the added student
        		int i = studentDao.insert(s);
        		System.out.println(i+ " student added successfully!");
        		System.out.println("*****************************");
        		break;
        	case 2:
        		//display all student
        		List<Student> list = studentDao.getAllStudents();
        		for(Student st:list) {
        			System.out.println("Id: "+st.getStudentId());
        			System.out.println("Name: "+st.getStudentName());
        			System.out.println("City: "+st.getStudentCity());
        			System.out.println("***************************");
        		}
        		break;
        	case 3:
        		//get single student data
        		System.out.println("Enter user id: ");
        		int userid = Integer.parseInt(br.readLine());
        		Student student = studentDao.getStudent(userid);
        		System.out.println("Id: "+student.getStudentId());
    			System.out.println("Name: "+student.getStudentName());
    			System.out.println("City: "+student.getStudentCity());
    			System.out.println("***************************");
        		break;
        	case 4:
        		//delete student
        		System.out.println("Enter user id: ");
        		int id = Integer.parseInt(br.readLine());
        		studentDao.deleteStudent(id);
        		System.out.println("student deleted");
        		System.out.println("********************");
        		break;
        	case 5:
        		//update student
        		System.out.println("Enter user id: ");
        		int uId = Integer.parseInt(br.readLine());
        		Student stu = studentDao.getStudent(uId);
        		System.out.println("Enter new name:");
        		String name = br.readLine();
        		System.out.println("Enter new city:");
        		String city = br.readLine();
        		stu.setStudentName(name);
        		stu.setStudentCity(city);
        		studentDao.updateStudent(stu);
        		System.out.println("student updated");
        		System.out.println("*******************");
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
