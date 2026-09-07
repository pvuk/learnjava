package com.practice.java.designpatterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Venkata.Pulipati
 * @since Thursday 14-August-2025 11:44:35
 */
@Slf4j
public class Employee {
	private Integer id;
	private String name;
	private String contactNumber;
	private String address;
	private String gender;
	
	private Employee() {
		
	}
	
	private Employee(Integer id, String name, String contactNumber, String address, String gender) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.gender = gender;
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}
	
	public static class EmployeeBuilder {
		private Integer id;
		private String name;
		private String contactNumber;
		private String address;
		private String gender;
		
		public EmployeeBuilder id(Integer id) {
			this.id = id;
			return this;
		}
		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}
		public EmployeeBuilder contactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
			return this;
		}
		public EmployeeBuilder address(String address) {
			this.address = address;
			return this;
		}
		public EmployeeBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Employee build() {
			return new Employee(id, name, contactNumber, address, gender);
		}
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", gender=" + gender + "]";
	}
	
	
}
