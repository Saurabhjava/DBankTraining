package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.bean.ExchangeBean;
import com.db.repo.ExchangeRepo;

@RestController
public class ExchangeController {
	@Autowired
	private ExchangeRepo repo;
	
	@GetMapping("/from/{from}/to/{to}")
	public ExchangeBean getValue(@PathVariable String from, @PathVariable String to) {
		return repo.findByFromAndTo(from, to);
	}
}
