package com;

public class Employee {
	
	private int empid;  
	private String name;
	private String email;
	
	public Employee() {}
	
	public Employee(int empid, String name, String email) {
		this.empid = empid;
		this.name = name;
		this.email = email;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}	
	@Override
	public String toString() {
		return empid+"\t"+name+"\t"+email;
	}
	
}
