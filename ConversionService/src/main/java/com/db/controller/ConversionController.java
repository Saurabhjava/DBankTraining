package com.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.bean.ConversionBean;
import com.db.proxy.ExchangeProxy;

@RestController
public class ConversionController {
	@Autowired
	private ExchangeProxy proxy;
	
	@GetMapping("/from/{from}/to/{to}/qty/{qty}")
	public ConversionBean calculateCurrency(@PathVariable String from,@PathVariable String to, @PathVariable int qty) {
		ConversionBean cb=proxy.getExchangeValue(from, to);
		cb.setQty(qty);
		cb.setTotalValue(qty*cb.getExchangeValue());
		return cb;
	}
}
