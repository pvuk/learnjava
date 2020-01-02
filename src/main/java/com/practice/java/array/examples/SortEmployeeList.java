package com.practice.java.array.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeList {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "ABC"));
		list.add(new Employee(2, "XYZ"));
		list.add(new Employee(3, "PQR"));
		list.add(new Employee(4, "KLM"));
		
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		list.forEach(l -> System.out.println(l));
	}
}
