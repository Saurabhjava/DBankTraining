package com;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.startsWith("A");
	}
	

}
