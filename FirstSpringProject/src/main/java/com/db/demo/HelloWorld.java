package com.db.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class HelloWorld {
	
	public String sayHello(String name) {
		return "Hello "+name; 
	}
}
