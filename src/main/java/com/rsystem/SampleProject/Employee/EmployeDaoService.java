package com.rsystem.SampleProject.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeDaoService {
	
	private static List<Employee> list = new ArrayList<>();
	
	static {
		list.add(new Employee(1, "Ankur"));
		list.add(new Employee(2, "XYZ"));
		list.add(new Employee(3, "ABC"));
	}

	public Employee save(Employee emp) {
		list.add(emp);
		return emp;
	}
	
	public List<Employee>  findAll() {
		return list;
	}
	
	public Employee  findOne(int id) {
		for(Employee emp : list) {
			if(emp.getId()==id)
				return emp;
		}
		return null;	
	}
	
}
