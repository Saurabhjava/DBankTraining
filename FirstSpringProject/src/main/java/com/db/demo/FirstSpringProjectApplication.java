package com.db.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(FirstSpringProjectApplication.class, args);
		
		/*
		 * HelloWorld h=ctx.getBean(HelloWorld.class);
		 * 
		 * System.out.println(h.sayHello("Kartik"));
		 * 
		 * HelloWorld h1=ctx.getBean(HelloWorld.class);
		 * 
		 * System.out.println(h); System.out.println(h1);
		 */
		
		Employee emp=ctx.getBean(Employee.class);
		emp.printEmployee();
	}

}
