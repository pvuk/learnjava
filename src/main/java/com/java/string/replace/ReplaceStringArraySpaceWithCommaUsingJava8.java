package com.java.string.replace;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <p>
 * append comma(,) between each element, postfix [ and prefix ]. Output: [a,b,c]
 * </p>
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Tue 29-Sep-2020 11:03
 */
public class ReplaceStringArraySpaceWithCommaUsingJava8 {
	public static void main(String[] args) {
		String collect = Arrays.asList("a b c".split(" ")).stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect);
	}
}
