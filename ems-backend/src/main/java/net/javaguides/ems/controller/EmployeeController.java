package net.javaguides.ems.controller;

import java.util.List;

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

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	//Build Add employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmpoyee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	//Build get employee REST API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id")Long employeeId){
		EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.ok(employeeDto);
	}
	
	//Build getall employees REST API
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> ggetAllEmployees(){
		List<EmployeeDto> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	//Build update employee REST API
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id")Long employeeId, @RequestBody EmployeeDto updatedemployee){
		EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedemployee);
		return ResponseEntity.ok(employeeDto);
	}
	
	//Build delete employee REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id")Long employeeId){
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.ok("Employee deleted successfully!");
	}
}
