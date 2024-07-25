package com.db.bean;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
	private int sid;
	private String name;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dob;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String name, LocalDate dob) {
		super();
		this.sid = sid;
		this.name = name;
		this.dob = dob;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
