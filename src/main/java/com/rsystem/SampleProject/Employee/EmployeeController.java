package com.rsystem.SampleProject.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeDaoService service;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		 return service.findAll();
	}
	
	@GetMapping("/employee/id/{id}")
	public Employee getEmployee(@PathVariable int id) {
		 return service.findOne(id);
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		 return service.save(emp);
	}
	
	

}
