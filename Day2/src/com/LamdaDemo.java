package com;

import java.util.function.Predicate;

public class LamdaDemo {

	public static void main(String[] args) {
		/*
		 * ICalculator cal=(x,y)->x/y; System.out.println(cal.calculate(15, 5));
		 * cal=(x,y)->x+y; System.out.println(cal.calculate(15, 5)); cal=(x,y)->x-y;
		 * System.out.println(cal.calculate(15, 5)); cal=(x,y)->x*y;
		 * System.out.println(cal.calculate(15, 5));
		 */
		
		Predicate<String> p=(s)->s.length()>=5;
		
		System.out.println(p.test("Rajesh"));
	}

}
