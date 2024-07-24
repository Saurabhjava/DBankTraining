package com.db.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private String country;
	private long zip;
	
	public Address() {
		city="Delhi";
		country="India";
		zip=110070;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	
	
}
