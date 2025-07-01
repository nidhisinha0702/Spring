package codewithnidhi.demoCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codewithnidhi.demoCRUD.entity.Employee;
import codewithnidhi.demoCRUD.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface empService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> listOfEmp = empService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(listOfEmp, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSaved = empService.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
	}
	
	@GetMapping("/emp/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") Long empidL){
		Employee oneEmployee = empService.getOneEmployee(empidL);
		return new ResponseEntity<Employee>(oneEmployee, HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") Long empIdL) {
		empService.deleteOneEmployee(empIdL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee employeeSaved = empService.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
	}
	
}
