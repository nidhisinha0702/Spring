package codewithnidhi.mongoCrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import codewithnidhi.mongoCrud.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
