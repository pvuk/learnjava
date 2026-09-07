package com.java.interview.nextlevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDigitsFromString {
	public static void main(String[] args) {
		String input = "org.h2.jdbc.JdbcSQLNonTransientConnectionException: Exception opening port \"9010\" (port may be in use), cause: \"java.net.BindException: Address already in use: bind\" [90061-232]";
		
		//Example1:
		String digitsOnly = input.replaceAll("\\D+", "");
		System.out.println("Extracted digits: " + digitsOnly);

		//Example 2:
		Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            String firstFourDigit = matcher.group();
            System.out.println("First 4-digit number: " + firstFourDigit);
        } else {
            System.out.println("No 4-digit number found.");
        }
	}
}

