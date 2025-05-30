package com.java.interview.others;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Tue 29-Sep-2020 20:07
 */
public class MethodOverloadingUsingParam {
	
	public static void main(String[] args) {
		MethodOverloadingUsingParam methodOverloadingUsingParam = new MethodOverloadingUsingParam();
		/*
		 * 1, 1f is correct way to access int a, float b otherwise ambiguous compile time error will come.
		 */
//		methodOverloadingUsingParam.test(1, 1);
		methodOverloadingUsingParam.test(1.0);
	}
	
	public static void test(float a, int b) {
			System.out.println("1");
		}
		
		public static void test(int a, float b) {
			System.out.println("2");
		}
		
		public static void test(Double d) {
			System.out.println("1");
		}
		
		public static void test(Integer d) {
			System.out.println("2");
		}
}

