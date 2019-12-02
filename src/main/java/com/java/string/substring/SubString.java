package com.java.string.substring;

import java.text.DecimalFormat;

public class SubString {
	public static void main(String[] args) {
		displayCurrency();
		System.out.println("====================================================================================================");
		subString();
		System.out.println("====================================================================================================");
	}

	private static void subString() {
		String jsonFileName = "put-card_type_code.json";
		int put = jsonFileName.indexOf("-");// first occurrence of character in a string '-' is 3
		int json = jsonFileName.lastIndexOf(".");// last occurrence of character in a string '.' is 18
		System.out.println(jsonFileName.substring(put + 1, json)); //beginIndex should be increase +1 otherwise it takes from index 3
	}

	private static void displayCurrency() {
//		String str = "121115.0";
//		System.out.println(str.substring(0, str.lastIndexOf(".")));//without fractional values

		String sub = "148012.743";
		System.out.println("SubString: "+ sub);
		if (sub.lastIndexOf(".") != -1 && sub.substring(sub.lastIndexOf(".")).length() > 3) {
			System.out.println("Using String.substring: "+ sub.substring(0, sub.lastIndexOf(".") + 3));// display upto 2 points
		} else {
			System.out.println(sub);
		}
		// or
		System.out.println("Using DecimalFormat: "+ new DecimalFormat("#.##").format(new Double(sub)));// display upto 2 points
	}
}
