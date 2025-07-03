package codewithnidhi.demoCRUD.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.EmployeeCrudRepo;
import codewithnidhi.demoCRUD.entity.Employee;
import codewithnidhi.demoCRUD.exception.BusinessException;
import codewithnidhi.demoCRUD.exception.EmptyInputException;

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
			if(employee.getName().isEmpty() || employee.getName().length() == 0) {
				throw new EmptyInputException("601","Input fields are empty");
			}
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
		try {
		 empCrud.deleteById(empIdL);
		}catch(IllegalArgumentException e) {
			throw new BusinessException("608"," Given employee id is null, please send some id to delete "+e.getMessage());
		}catch(NoSuchElementException e) {
			throw new BusinessException("609"," Given employee id does not exist in db to be deleted "+e.getMessage());
		}
	}
}
