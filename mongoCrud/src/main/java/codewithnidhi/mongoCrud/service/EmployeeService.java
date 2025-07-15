package codewithnidhi.mongoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codewithnidhi.mongoCrud.model.Employee;
import codewithnidhi.mongoCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveOrUpdate(Employee emp) {
		return repo.save(emp);
	}
	
	public List<Employee> findAll(){
		return repo.findAll();
	}
	
	public void delete(Employee emp) {
		repo.delete(emp);
	}
}
