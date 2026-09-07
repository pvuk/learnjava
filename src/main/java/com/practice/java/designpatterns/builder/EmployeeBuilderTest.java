package com.practice.java.designpatterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>🔧 Summary</br>
	* Lombok uses <b>annotation processing</b> to generate boilerplate code.</br>
	* The new keyword is used internally in the generated build() method.</br>
	* You get a clean, fluent API without manually writing the builder class.</br>
	</p>
	
	<p>Why Choose the Builder Pattern?</br>
	<b>Flexibility and Extensibility</b></br>
	Builders allow for the creation of different configurations of an object without the need for multiple constructors. It’s easy to add new parameters or modify existing ones without affecting client code.</br>
	</p>
 * @author Venkata.Pulipati
 * @since Thursday 14-August-2025 11:56:43
 */
public class EmployeeBuilderTest {
	private static Logger LOG = LoggerFactory.getLogger(EmployeeBuilderTest.class);
	
	public static void main(String[] args) {
		Employee employee = Employee.builder()
				.id(1)
				.name("UdayKiran")
				.address("Hyderabad")
				.build();//creating without new keyboard like lombok @Builder pattern
		
//		Employee employee1 = new Employee();
//		employee1.builder().build();
		
		LOG.info("Employee: {}", employee.toString());
	}
}
