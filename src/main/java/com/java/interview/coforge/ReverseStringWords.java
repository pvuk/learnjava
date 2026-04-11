package com.java.interview.coforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseStringWords {
	public static void main(String[] args) {
		//Problem Statement 1
				String str = "Hello My Name is Test";
				//Convert it as "Test is Name My Hello"
//				Arrays.asList(str.split(" ")).stream()
				List<String> asList = Arrays.asList(str.split(" "));
				Collections.reverse(asList);
				System.out.println(asList);
				String join = String.join(" ", asList);
				System.out.println(join);//convert list to string
	}
}
