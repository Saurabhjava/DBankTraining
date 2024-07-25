package com.db.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.bean.Employee;
import com.db.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eservice;
	
	@GetMapping
	public List<Employee> getAllEmployee() {
		return eservice.getAllEmployee();
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity getEmployee(@PathVariable int empid) {
		Employee e=eservice.getEmployeeById(empid);
		if(e!=null)
			return new ResponseEntity<>(e,HttpStatus.FOUND);
		else
			return new ResponseEntity<>("Employee Not Found",HttpStatus.NOT_FOUND);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return eservice.createEmployee(emp);
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable int empid) {
		return eservice.deleteEmployee(empid);
	}
}
