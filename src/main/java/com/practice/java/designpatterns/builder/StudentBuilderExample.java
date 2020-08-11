package com.practice.java.designpatterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentBuilderExample {
	
	public static void main(String[] args) {
		try {
			/*
			 * passing required parameters is mandatory and if optional parameters are not passed they
			 * are assigned with their default values.
			 */
			Student student = new Student.StudentBuilder("udaykiran", "pulipati").build();
			log.info("{}", student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int method1(int a)
	{
		System.out.println("Integer: "+a);
		return a;
	}
	public double method1(double a)
	{
		System.out.println("Double "+a);
		return a;
	}
}
