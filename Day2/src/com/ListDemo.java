package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {
	
	
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		li.add(12);
		li.add(45);
		li.add(12);
		li.add(32);
		li.add(45);
		
		/*
		 * for(int i=0; i<li.size(); i++) { System.out.println(li.get(i)); }
		 */
		/*
		 * for(int x:li) { System.out.println(x); }
		 */
		//Consumer<Integer> c=(i)->System.out.println(i);
		li.forEach(i->System.out.println(i));
	}

}
