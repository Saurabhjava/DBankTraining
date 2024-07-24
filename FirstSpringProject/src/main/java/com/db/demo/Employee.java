package com.db.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("myPhone")
	private List<Phone> phone;
	
	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public Employee() {
		empid=1001;
		name="Amit";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printEmployee() {
		System.out.println("EmployeeID: "+empid);
		System.out.println("Name: "+name);
		System.out.println("==========Address Of Employee========");
		System.out.println("City: "+address.getCity());
		System.out.println("Country: "+address.getCountry());
		System.out.println("Zip: "+address.getZip());
		System.out.println("=======Employee Phone=======");
		phone.forEach(p->System.out.println(p.getType()+"\t"+p.getNumber()));
	}
}
