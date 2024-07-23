package com;

public class Main {

	public static void main(String[] args) {

		ICalculator cal = new Summing();
		System.out.println(cal.calculate(10, 5));
		cal = new Subtraction();
		System.out.println(cal.calculate(10, 5));
		cal = new Multiplication();
		System.out.println(cal.calculate(10, 5));

	}

}
