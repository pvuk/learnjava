package com.java.interview.coforge;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer id;
	private String name;
	private Integer salary;
	private String departmentName;
	
	public static void main(String[] args) {
//		List<Employee> list = new ArrayList<Employee>({
//			add(Employee().builder().build());//1, "UdayKiran", 1,99,000, "IT"
//		});
		List<Employee> list = new ArrayList<Employee>();
		list.add(Employee.builder().id(1).name("UdayKiran").salary(199000).departmentName("IT").build());
		list.add(Employee.builder().id(2).name("Venkata").salary(213000).departmentName("IT").build());
		list.add(Employee.builder().id(3).name("Pulipati").salary(236000).departmentName("IT").build());
		
		Predicate<Employee> predicateSalary = (e) -> e.getSalary() > 200000;
		List<Employee> collect = list.stream().filter(predicateSalary).collect(Collectors.toList());
		System.out.println("Salaray greater than 2,00,000");
		collect.forEach(e -> System.out.println(e));
	}
}
