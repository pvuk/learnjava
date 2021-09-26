package com.java.interview;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 17:34
 */
public class StaticValueInitialization {
	static int i;//default 0
	static Integer integer;//default null
	
	/**
	 * 
	 */
	public StaticValueInitialization() {
		i = 1;//can't call without calling new instance
	}
	
	public static void main(String[] args) {
		System.out.println("i value: "+ i);//print 0, because constructor not called
		System.out.println("integer value: "+ integer);// integer value is null

		StaticValueInitialization staticValueInitialization = new StaticValueInitialization();
		System.out.println(i);// i value is 1, constructor called.
		StaticValueInitialization.i = 2;
		StaticValueInitialization.integer = 3;
		System.out.println("after assign 2 i value: "+ i);//i value is 2
		System.out.println("after assign 3 integer value: "+ integer);//integer value is 3
	}
}
