package com.example.ass5.ASS5.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ass5.ASS5.model.Employee;
import com.example.ass5.ASS5.repo.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<Employee>();  
		employeeRepository.findAll().forEach(e1 -> employee.add(e1));  
		return employee;  
	}

	public Employee getEmployeeByName(String id) {
		
		return employeeRepository.findById(id).get(); 
	}

	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);  
	} 

	

	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * public void Update(String id) { employeeRepository.updateById(id);
	 * 
	 * }
	 */
	

	

	

	

	

}
