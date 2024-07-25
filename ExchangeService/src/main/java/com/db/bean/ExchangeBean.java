package com.db.bean;

public class ExchangeBean {
	private String from;
	private String to;
	private int exchangeValue;
	
	public ExchangeBean() {
		// TODO Auto-generated constructor stub
	}

	public ExchangeBean(String from, String to, int exchangeValue) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getExchangeValue() {
		return exchangeValue;
	}

	public void setExchangeValue(int exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	
	
	
}
