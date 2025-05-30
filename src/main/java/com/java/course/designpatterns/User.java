package com.java.course.designpatterns;

import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Fri 30-Oct-2020 08:11
 */
@Data
public class User {
	
	private String name;
	
	User(String name) {
		this.name = name;//this.name means setting name value to current object.
	}
}
