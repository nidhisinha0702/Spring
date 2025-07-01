package codewithnidhi.demoCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.EmployeeCrudRepo;
import codewithnidhi.demoCRUD.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeCrudRepo empCrud;
	
	public List<Employee> getAllEmployees(){
		return empCrud.findAll();
	}
}
