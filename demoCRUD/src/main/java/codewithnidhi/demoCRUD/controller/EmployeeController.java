package codewithnidhi.demoCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codewithnidhi.demoCRUD.entity.Employee;
import codewithnidhi.demoCRUD.service.EmployeeService;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> emp = empService.getAllEmployees();
		return emp;
	}
}
