package com.java.interview.coforge;
import java.util.*;
import java.util.stream.*;

/**
 * 
 * @author Venkata.Pulipati
 * @since Friday 19-September-2025 13:44:52
 */
public class HighestSalaryByDepartment {
    public static void main(String[] args) {
        List<EmployeeData> employees = Arrays.asList(
            new EmployeeData("Alice", "HR", 50000),
            new EmployeeData("Bob", "HR", 60000),
            new EmployeeData("Charlie", "IT", 70000),
            new EmployeeData("David", "IT", 80000),
            new EmployeeData("Eve", "Finance", 75000)
        );

//        Map<String, Optional<EmployeeData>> highestPaidByDept = employees.stream()
//            .collect(Collectors.groupingBy(
//            	EmployeeData::getDepartment,
//                Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary))
//            ));
//
//        highestPaidByDept.forEach((dept, emp) -> 
//            System.out.println(dept + ": " + emp.orElse(null))
//        );
        //OR
        
        System.out.println("Highest Salary from Each Department: Exampel 1: ");
        //Highest Salary
        employees.stream()
        .collect(Collectors.groupingBy(
        	EmployeeData::getDepartment,
            Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary))
        )).forEach((dept, emp) -> System.out.println(dept +": "+ emp.orElse(null)));
        
        System.out.println("\n2nd Highest Salary: Example 1: ");
        //2nd Highest Salary
        Map<String,EmployeeData> collect = employees.stream()
        .collect(Collectors.groupingBy(EmployeeData::getDepartment,
        		Collectors.collectingAndThen(Collectors.toList(), 
        				list -> {
        					return list.stream()
        							.sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed())
        							.skip(1)
        							.findFirst()
        							.orElse(null);
        				})));
        collect.forEach((dept, emp) -> System.out.println(dept +": "+ (emp != null ? emp : "No second highest")));
        
        System.out.println("\n 2nd Highest Salary: Example 2: ");
        employees.stream()
                .collect(Collectors.groupingBy(
                    EmployeeData::getDepartment,
                    Collectors.collectingAndThen(
                        Collectors.mapping(
                            e -> e,
                            Collectors.toList()
                        ),
                        list -> {
                        	return list.stream()
                                    .sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed())
                                    .skip(1)//skips the highest salary.
                                    .findFirst()//findFirst() gets the second highest.
                                    .orElseGet(() -> new EmployeeData("No second highest", "", 0));
                                    //If a department has only one employee, it returns null. 
                                    //Uses orElseGet() to handle missing second highest elegantly.
                        }
                    )
                ))
                .forEach((dept, emp) -> System.out.println(dept +": "+ emp));
    }
}

class EmployeeData {
    String name;
    String department;
    double salary;

    public EmployeeData(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}
