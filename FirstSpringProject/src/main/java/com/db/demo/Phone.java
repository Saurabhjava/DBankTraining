package com.db.demo;

import org.springframework.stereotype.Component;

//@Component
public class Phone {
	private String type;
	private long number;
	
	public Phone() {
		
	}
	public Phone(String type, long number) {
		super();
		this.type = type;
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
}
