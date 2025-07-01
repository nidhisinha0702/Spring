package codewithnidhi.demoCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.EmployeeCrudRepo;
import codewithnidhi.demoCRUD.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeCrudRepo empCrud;
	
	public List<Employee> getAllEmployees(){
		return empCrud.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = empCrud.save(employee);
		return savedEmployee;
		
	}

	@Override
	public Employee getOneEmployee(Long id) {
		Employee byIdEmployee = empCrud.findById(id).get();
		return byIdEmployee;
	}

	@Override
	public void deleteOneEmployee(Long empIdL) {
		empCrud.deleteById(empIdL);
	}
}
