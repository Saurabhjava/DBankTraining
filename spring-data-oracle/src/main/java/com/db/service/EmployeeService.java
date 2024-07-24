package com.db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.bean.Employee;
import com.db.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public String createEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		return "Employee Created ";
	}
	
	public Employee getEmployeeById(int empid) {
		Optional<Employee> op= repo.findById(empid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
}
