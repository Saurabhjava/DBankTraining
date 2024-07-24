package com.db.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig {
	@Bean
	public List<Phone> myPhone() {
		List<Phone> li=new ArrayList<Phone>();
		li.add(new Phone("Home",999945670));
		li.add(new Phone("Work",999945671));
		li.add(new Phone("Personal",999945672));
		return li;
	}
	@Bean
	public List<Phone> phones() {
		List<Phone> li=new ArrayList<Phone>();
		li.add(new Phone("Home",99990001));
		li.add(new Phone("Work",99990002));
		li.add(new Phone("Personal",99990003));
		return li;
	}
}
