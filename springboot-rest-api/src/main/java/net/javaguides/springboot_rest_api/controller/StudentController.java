package net.javaguides.springboot_rest_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot_rest_api.bean.Student;

@RestController
public class StudentController {

	//http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student(
				 1,
				"Nidhi",
				"Kumari"
				);
		return student;
				
	}
	
	//http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"Nidhi","Kumari"));
		students.add(new Student(2,"Ram","Kumar"));
		students.add(new Student(3,"John","Doe"));
		students.add(new Student(4,"Sarika","Kumari"));
		return students;
	}
	
	//{id}- URI template variable
	//Spring boot REST API with Path Variable
	//http://localhost:8080/students/1/nidhi/kumari
	@GetMapping("/students/{id}/{first-name}/{last-name}")
	public Student studentPathVariable(@PathVariable("id") int studentId,
									   @PathVariable("first-name") String firstName,@PathVariable("last-name") String lastName) {
		return new Student(studentId,firstName,lastName);
	}
	
	//Spring boot REST API with Request Param
	//http://localhost:8080/students/query?id=1&firstName=Nidhi&lastName=Kumari
	@GetMapping("/students/query")
	public Student studentRequestVariable(@RequestParam int id,
										@RequestParam String firstName,
										@RequestParam String lastName) {
		return new Student(id,firstName,lastName);
	}
}
