package codewithnidhi.ems_backendApp.service.impl;

import org.springframework.stereotype.Service;

import codewithnidhi.ems_backendApp.dto.EmployeeDto;
import codewithnidhi.ems_backendApp.entity.Employee;
import codewithnidhi.ems_backendApp.mapper.EmployeeMapper;
import codewithnidhi.ems_backendApp.repository.EmployeeRepository;
import codewithnidhi.ems_backendApp.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
