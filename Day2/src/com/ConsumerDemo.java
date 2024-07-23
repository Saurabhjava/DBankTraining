package com;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}
