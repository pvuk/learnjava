package com.java.string.substring;

import java.text.DecimalFormat;

public class SubString {
	public static void main(String[] args) {
//		String str = "121115.0";
//		System.out.println(str.substring(0, str.lastIndexOf(".")));//without fractional values
		
		String sub = "148012.743";
		if (sub.lastIndexOf(".") != -1 && sub.substring(sub.lastIndexOf(".")).length() > 3){
			System.out.println(sub.substring(0, sub.lastIndexOf(".") + 3));// display upto 2 points
		} else {
			System.out.println(sub);
		}
		//or
		System.out.println(new DecimalFormat("#.##").format(new Double(sub)));// display upto 2 points
	}
}
