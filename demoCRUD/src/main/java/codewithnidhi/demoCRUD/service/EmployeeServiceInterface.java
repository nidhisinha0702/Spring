package codewithnidhi.demoCRUD.service;

import java.util.List;

import codewithnidhi.demoCRUD.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getOneEmployee(Long id);

	public void deleteOneEmployee(Long empIdL);

}
