package codewithnidhi.mongoCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import codewithnidhi.mongoCrud.model.Employee;
import codewithnidhi.mongoCrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(service.saveOrUpdate(emp), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Employee>> getAll(){
		return new ResponseEntity<List<Employee>>(service.findAll(), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody Employee emp){
		service.delete(emp);
		return new ResponseEntity<String>("Recored Deleted",HttpStatus.ACCEPTED);
	}
}
