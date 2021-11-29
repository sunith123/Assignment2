package com.example.ass5.ASS5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ass5.ASS5.Service.EmployeeService;
import com.example.ass5.ASS5.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	private List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/employee/{id}")
	private Employee getBooks(@PathVariable String id) {
		return employeeService.getEmployeeByName(id);
	}

	@DeleteMapping("/employee/{id}")
	private void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}

	
	@PostMapping("/employee")
	public int saveBook(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employeeService.getId();
	}
}
