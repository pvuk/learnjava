package com.java8.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sat 17-May-2025 06:21
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> duplicateList = Arrays.asList(1, 2, 3, 1, 5, 3, 7, 9);
		List<Integer> filterList = duplicateList.stream().distinct().collect(Collectors.toList());
		System.out.println("Filter Duplicates From Array: "+ filterList);
		
		System.out.println("Example 2:");
		System.out.println("Removing Duplicates From Class Object Without overriding equals and hashCode");
		List<Person> duplicatePersons = Arrays.asList(new Person("Venkata", 36),
				new Person("Devashish", 3),
				new Person("Priyanka", 30),
				new Person("UdayKiran", 36),
				new Person("Venkata", 36));
		List<Person> filterPersonListWithoutOverriding = duplicatePersons.stream().distinct().collect(Collectors.toList());
		System.out.println(filterPersonListWithoutOverriding);
		
		System.out.println("Example 3:");
		System.out.println("Removing Duplicates From Class Object overriding equals and hashCode");
		List<Customer> duplicateCustomers = Arrays.asList(new Customer("Venkata", 36),
				new Customer("Devashish", 3),
				new Customer("Priyanka", 30),
				new Customer("UdayKiran", 36),
				new Customer("Venkata", 36),
				new Customer("SimhaNandha", 3));
		List<Customer> filterCustomerListWithOverriding = duplicateCustomers.stream().distinct().collect(Collectors.toList());
		System.out.println(filterCustomerListWithOverriding);
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name +" ("+ age +")";
	}
}

class Customer {
	String name;
	int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name +" ("+ age +")";
	}
	
	@Override
	public boolean equals(Object obj) {
		// checking if both the object references are referring to the same object.
		if(this == obj) return true;
		
		// it checks if the argument is of the type Customer by comparing the classes of the passed argument and this object. 
		//if(!(obj instanceof Customer)) return false; ---> avoid.
		if(this == null || getClass() != obj.getClass()) return false;
		
		// type casting of the argument. 
		Customer customer = (Customer) obj;

		// comparing the state of argument with the state of 'this' Object.
		return name.equals(customer.name) && age == customer.age;
	}
	
	/**
	 * If two objects are equal according to equals() method, then their hash code must be same.
	 * If two objects are unequal according to equals() method, their hash code are not required to be different. Their hash code value may or may-not be equal.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// We are returning the age
	    // as a hashCode value.
	    // we can also return some 
	    // other calculated value or may
	    // be memory address of the 
	    // Object on which it is invoked. 
	    // it depends on how you implement 
	    // hashCode() method.
		
		//2. Use same properties in both equals() and hashCode() method implementations, so that their contract doesn’t violate when any properties is updated.

		int hash = Objects.hash(age, name);//get hash value
		int hashCode = name.hashCode();
		System.out.println("Name: "+ name +"hash: "+ hash +", hashCode: "+ hashCode);
		return age + name.hashCode();
	}
}
