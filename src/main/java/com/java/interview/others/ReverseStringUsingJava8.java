package com.java.interview.others;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * <p>
 * Input a String with dot separator, reverse the string positions only.</br>
 * <b>Ex:</b> I.LIKE.YOU.VERY.MUCH should be print as MUCH.VERY.YOU.LIKE.I
 * </p>
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Tue 29-Sep-2020 06:46
 */
public class ReverseStringUsingJava8 {

		public static void main(String[] args) {
			String str = "I.LIKE.YOU.VERY.MUCH";
			String[] split = str.split("[.]");
			Collections.reverse(Arrays.asList(split));
			System.out.println(Arrays.asList(split).stream().collect(Collectors.joining(".")));//MUCH.VERY.YOU.LIKE.I
		}
}
