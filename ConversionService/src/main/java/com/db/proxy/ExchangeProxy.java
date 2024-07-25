package com.db.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.db.bean.ConversionBean;

@FeignClient(name="ExchangeService", url = "localhost:8081")
public interface ExchangeProxy {
	@GetMapping("/from/{from}/to/{to}")
	public ConversionBean getExchangeValue(@PathVariable String from, @PathVariable String to);
}
