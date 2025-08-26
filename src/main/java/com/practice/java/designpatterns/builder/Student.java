package com.practice.java.designpatterns.builder;

/**
 * 
 * <h1><a href=
 *         "https://www.journaldev.com/1425/builder-design-pattern-in-java">Builder
 *         Design Pattern</a></h1>
 *         <p>
 *         Builder pattern was introduced to solve some of the problems with
 *         Factory and Abstract Factory design patterns when the Object contains
 *         a lot of attributes.
 *         </p>
 *         <p>
 *         There are three major issues with Factory and Abstract Factory design
 *         patterns when the Object contains a lot of attributes.
 *         </p>
 *         <ol>
 *         <li>Too Many arguments to pass from client program to the Factory
 *         class that can be error prone because most of the time, the type of
 *         arguments are same and from client side its hard to maintain the
 *         order of the argument.</li>
 *         <li>Some of the parameters might be optional but in <a href=
 *         "https://www.journaldev.com/1392/factory-design-pattern-in-java">Factory
 *         pattern</a>, we are forced to send all the parameters and optional
 *         parameters need to send as NULL.</li>
 *         <li>If the object is heavy and its creation is complex, then all that
 *         complexity will be part of Factory classes that is confusing.</li>
 *         </ol>
 *         <p>
 *         We can solve the issues with large number of parameters by providing
 *         a constructor with required parameters and then different setter
 *         methods to set the optional parameters. The problem with this
 *         approach is that the Object state will be
 *         <strong>inconsistent</strong> until unless all the attributes are set
 *         explicitly.
 *         </p>
 *         <p>
 *         Builder pattern solves the issue with large number of optional
 *         parameters and inconsistent state by providing a way to build the
 *         object step-by-step and provide a method that will actually return
 *         the final Object.
 *         </p>
 *         <div style="float: none; margin:10px 0 10px 0;
 *         text-align:center;"><div data-type="ad" data-publisher=
 *         "journaldev.com" data-format="300x250" data-zone=
 *         "jd_post_mid_300x250"></div></div>
 *         <h2><span id="builder-design-pattern-in-java">Builder Design Pattern
 *         in Java</span></h2>
 *         <p>
 *         Let�s see how we can implement builder design pattern in java.
 *         </p>
 *         <ol>
 *         <li>First of all you need to create a
 *         <a href="https://www.journaldev.com/996/java-inner-class">static
 *         nested class</a> and then copy all the arguments from the outer class
 *         to the Builder class. We should follow the naming convention and if
 *         the class name is <code>Computer</code> then builder class should be
 *         named as <code>ComputerBuilder</code>.</li>
 *         <li>Java Builder class should have a public constructor with all the
 *         required attributes as parameters.</li>
 *         <li>Java Builder class should have methods to set the optional
 *         parameters and it should return the same Builder object after setting
 *         the optional attribute.</li>
 *         <li>The final step is to provide a <code>build()</code> method in the
 *         builder class that will return the Object needed by client program.
 *         For this we need to have a private constructor in the Class with
 *         Builder class as argument.</li>
 *         </ol>
 * 
 * 
 * 		<h1>-------------------------------------------------------------------------------------</h1>
 *         <br>
 * 
 *         <h1><a href=
 *         "https://dzone.com/articles/the-builder-pattern-for-class-with-many-constructo">What
 *         Is the Builder Pattern?</a></h1>
 *         <p>
 *         First, Let�s see how we can implement a builder design pattern.
 *         </p>
 *         <ol>
 *         <li>First of all, you need to create a public static nested class,
 *         which has all the instance attributes from the outer class. The
 *         naming convention for Builder usually is that and if the class name
 *         is Student, then the builder class should be named as StudentBuilder.
 *         </li>
 *         <li>The outer class Student should have a private constructor that
 *         takes a StudentBuilder object as its argument.</li>
 *         <li>The builder class should have a public constructor with all the
 *         required attributes as parameters and these required attributes are
 *         defined as "final," which have setter methods to set the optional
 *         parameters. It should return the same Builder object after setting
 *         the optional attribute.</li>
 *         <li>The final step is to provide a build() method in the builder
 *         class that will return the outer class object to the client. This
 *         build() method will call the private constructor in the outer class,
 *         passing the Builder object itself as the parameter to this private
 *         constructor.</li>
 *         <li>The Student class has only getter methods and no public
 *         constructor. So, the only way to get an Student object is through the
 *         nested StudentBuilder class.</li>
 *         </ol>
 *         
 * @author venkataudaykiranp
 * 
 *         
 */
public class Student {
	
	private final String firstName;//required
	private final String lastName;//required
	private final int age;//optional
	private final String phone;//optional
	private final String address;//optional
	
	//All getter, and NO setter to provide immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
		
	private Student(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	//Builder class
	public static class Builder {
		
		//required parameters
		private final String firstName;
		private final String lastName;
		//optional parameters
		private int age;
		private String phone;
		private String address;
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		//Return the finally constructed Student object
		public Student build() throws Exception {
			validateStudent();
			return new Student(this);
		}

		private void validateStudent() throws Exception {
			if (this.firstName == null || this.firstName.equals("")) {
				throw new Exception("First Name is required field");
			}
			if (this.lastName == null || this.lastName.equals("")) {
				throw new Exception("Last Name is required field");
			}
		}
	}
}
