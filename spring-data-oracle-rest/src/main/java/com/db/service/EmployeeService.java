package com.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.bean.Employee;
import com.db.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//Constructor Injection	
	/*
	 * public EmployeeService(EmployeeRepository repo) { this.repo = repo; }
	 */
	public Employee getEmployeeById(int empid) {
		Optional<Employee> op= repo.findById(empid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}
	
	public Employee createEmployee(Employee emp) {
		return repo.saveAndFlush(emp);
	}
	public String deleteEmployee(int empid) {
		if(getEmployeeById(empid)!=null) {
			repo.deleteById(empid);
			return "Employee Deleted";
		}
		else {
			return "Employee Not Found";
		}
	}
}
