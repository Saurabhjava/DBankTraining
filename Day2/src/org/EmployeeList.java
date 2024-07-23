package org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		
		li.add(new Employee(101, "Rahul", 65000));
		li.add(new Employee(102, "Amit", 45000));
		li.add(new Employee(103, "Pradeep", 75000));
		li.add(new Employee(104, "Kanika", 35000));
		li.add(new Employee(105, "Rohit", 95000));
		li.add(new Employee(106, "Atul", 85000));
		li.add(new Employee(107, "Saurabh", 25000));
		
		/*
		 * for(Employee e:li) { System.out.println(e); }
		 */
		//li.forEach(x->System.out.println(x));
		
		//Stream<Employee> s= li.stream();
		//Stream<Employee> s1=s.filter(e->e.getSalary()<50000);
		//s1.forEach(e->System.out.println(e));
		//li.stream().filter(e->e.getSalary()<50000).forEach(x->System.out.println(x));
		//li.stream().filter(e->e.getName().startsWith("A")).forEach(x->System.out.println(x));
		//li.stream().sorted((e,e1)->e1.getSalary()-e.getSalary()).forEach(x->System.out.println(x));
		
		double totalSal=li.stream().filter(e->e.getSalary()<50000).collect(Collectors.summingInt(e->e.getSalary()));
		
		System.out.println(totalSal);
	}

}

