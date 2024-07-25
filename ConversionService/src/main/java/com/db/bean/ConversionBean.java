package com.db.bean;

public class ConversionBean {
	private String from;
	private String to;
	private int exchangeValue;
	private int qty;
	private double totalValue;
	
	public ConversionBean() {
		// TODO Auto-generated constructor stub
	}

	public ConversionBean(String from, String to, int exchangeValue, int qty, double totalValue) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
		this.qty = qty;
		this.totalValue = totalValue;
	}



	public String getFroms() {
		return from;
	}

	public void setFroms(String from) {
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
}
