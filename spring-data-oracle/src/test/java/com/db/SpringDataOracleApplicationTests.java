package com.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db.bean.Employee;
import com.db.repo.EmployeeRepository;
import com.db.service.EmployeeService;

@SpringBootTest
class SpringDataOracleApplicationTests {

	@Mock
	private EmployeeRepository eRepo;
	@InjectMocks
	private EmployeeService service;

	/*
	 * @Test public void getEmployeeByIdTest() {
	 * assertNotNull(service.getEmployeeById(2)); assertEquals("Khushi",
	 * service.getEmployeeById(2).getName()); }
	 * 
	 * @Test public void getEmployeeByIdNullTest() {
	 * assertNull(service.getEmployeeById(112)); }
	 * 
	 * @Test public void createEmployeeTest() { Employee emp = new
	 * Employee("Monika1", "monika1@gmail.com"); assertEquals("Employee Created ",
	 * service.createEmployee(emp)); }
	 */
	@Test
	void getEmployeeBIdMockTest() {
		Employee emp = new Employee("Raj", "raj@gmail.com");
		emp.setEmpid(101);
		Employee emp1 = new Employee("Raj1", "raj1@gmail.com");
		emp.setEmpid(102);
		Optional<Employee> op = Optional.of(emp);
		Optional<Employee> op1 = Optional.of(emp1);

		when(eRepo.findById(101)).thenReturn(op);
		when(eRepo.findById(102)).thenReturn(op1);

		assertEquals(emp, service.getEmployeeById(101));
		assertEquals(emp1, service.getEmployeeById(102));

	}

}
