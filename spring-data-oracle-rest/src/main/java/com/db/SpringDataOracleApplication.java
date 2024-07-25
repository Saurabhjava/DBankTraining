package com.db;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataOracleApplication.class, args); // ApplicationContext and BeanFactory is use to call IOC
		/*
		 * EmployeeService eservice=ctx.getBean(EmployeeService.class); List<Employee>
		 * emps=eservice.getAllEmployee();
		 * emps.forEach(e->System.out.println(e.getName()));
		 */
	}

}
