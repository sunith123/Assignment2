package com.example.ass5.ASS5.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.ass5.ASS5.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>  
{  
}
