package com.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.db.bean.Employee;
import com.db.service.EmployeeService;

@SpringBootApplication
public class SpringDataOracleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringDataOracleApplication.class, args);
		EmployeeService eservice=ctx.getBean(EmployeeService.class);
		//String result=eservice.createEmployee(new Employee("Deepti", "deepti@gmail.com"));
		//System.out.println(result);
		Employee emp=eservice.getEmployeeById(102);
		if(emp!=null)
			System.out.println(emp.getEmpid()+"\t"+emp.getName()+"\t"+emp.getEmail());
		else
			System.out.println("Employee Not Found ");
	}

}
