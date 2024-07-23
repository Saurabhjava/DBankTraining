package org;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<Employee>((e,e1)->e.getName().compareTo(e1.getName()));
		
		s.add(new Employee(101,"Amit",56000));
		s.add(new Employee(102,"Rahul",86000));
		s.add(new Employee(103,"Raj",46000));
		s.add(new Employee(104,"Atul",66000));
		s.add(new Employee(105,"Saurabh",36000));
		s.forEach(e->System.out.println(e));
		
		
	}

}
