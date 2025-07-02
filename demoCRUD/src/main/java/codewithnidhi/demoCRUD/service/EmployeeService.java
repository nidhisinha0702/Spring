package codewithnidhi.demoCRUD.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.EmployeeCrudRepo;
import codewithnidhi.demoCRUD.entity.Employee;
import codewithnidhi.demoCRUD.exception.BusinessException;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeCrudRepo empCrud;
	
	public List<Employee> getAllEmployees(){
		List<Employee> empList = null;
		try {
			empList = empCrud.findAll();
		}catch(Exception e) {
			throw new BusinessException("605"," Something went wrong in service layer while fetching all employees "+e.getMessage());
		}
		if(empList.isEmpty()) {
			throw new BusinessException("604"," Hey list is empty nothing to return ");
		}
		return empList;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		if(employee.getName().isEmpty() || employee.getName().length() == 0)
			throw new BusinessException("601"," Please send proper name, It's blank");
		try {
			Employee savedEmployee = empCrud.save(employee);
			return savedEmployee;
		}catch(IllegalArgumentException e) {
			throw new BusinessException("602"," Given employee is null "+e.getMessage());
		}catch(Exception e) {
			throw new BusinessException("603"," Something went wrong in service layer while saving the employee "+e.getMessage());
		}
	}

	@Override
	public Employee getOneEmployee(Long id) {
		try {
			Employee byIdEmployee = empCrud.findById(id).get();
			return byIdEmployee;
		}catch(IllegalArgumentException e) {
			throw new BusinessException("606"," Given employee id is null, please send some id to search "+e.getMessage());
		}catch(NoSuchElementException e) {
			throw new BusinessException("607"," Given employee id does not exist in db "+e.getMessage());
		}
		
	}

	@Override
	public void deleteOneEmployee(Long empIdL) {
		try {
		 empCrud.deleteById(empIdL);
		}catch(IllegalArgumentException e) {
			throw new BusinessException("608"," Given employee id is null, please send some id to delete "+e.getMessage());
		}catch(NoSuchElementException e) {
			throw new BusinessException("609"," Given employee id does not exist in db to be deleted "+e.getMessage());
		}
	}
}
