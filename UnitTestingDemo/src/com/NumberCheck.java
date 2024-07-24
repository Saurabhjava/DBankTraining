package com;

public class NumberCheck {
	public String checkEvenOrOddNumber(int num) {
		if (num > 0) {
			if (num % 2 == 0)
				return "Even";
			else
				return "Odd";
		} else
			return "Invaid Number";
	}
	
	public boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
