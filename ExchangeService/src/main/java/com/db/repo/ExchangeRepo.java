package com.db.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.db.bean.ExchangeBean;

@Repository
public class ExchangeRepo {
	static List<ExchangeBean> li;
	static {
		li=new ArrayList<ExchangeBean>();
		li.add(new ExchangeBean("USD","INR", 80));
		li.add(new ExchangeBean("EUR","INR", 90));
		li.add(new ExchangeBean("AUD","INR", 60));
		li.add(new ExchangeBean("PON","INR", 95));
	}
	
	public ExchangeBean findByFromAndTo(String from, String to) {
		return li.stream().filter(e->(e.getFrom().equalsIgnoreCase(from) && e.getTo().equalsIgnoreCase(to))).findFirst().get();
	}
}
