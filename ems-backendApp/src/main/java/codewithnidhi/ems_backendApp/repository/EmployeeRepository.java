package codewithnidhi.ems_backendApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codewithnidhi.ems_backendApp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
