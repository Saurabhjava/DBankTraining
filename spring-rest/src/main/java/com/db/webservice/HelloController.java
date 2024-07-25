package com.db.webservice;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.bean.Student;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot Rest";
	}
	@GetMapping("/student")
	public Student sayHello1() {
		return new Student(101,"Komal", LocalDate.parse("1990-05-12"));
	}
	
	/*
	 * @GetMapping("/hi") public String sayHello1() { return "Hi Spring Rest"; }
	 * 
	 * @GetMapping("/db/{name}") public String sayHello(@PathVariable String name) {
	 * return "Hello "+name; }
	 */
	
}
