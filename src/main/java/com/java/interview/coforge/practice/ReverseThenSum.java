package com.java.interview.coforge.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 02-September-2025 16:48:43
 */
public class ReverseThenSum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 34, 56);
		List<Integer> sumList = list.stream()
		    .map(num -> {
		        int rev = 0, n = num;
		        while (n != 0) {
		            rev = rev * 10 + n % 10;
		            n /= 10;
		        }
		        return num + rev;
		    })
		    .collect(Collectors.toList());
		
		System.out.println(sumList); // [33, 77, 121]

	}

}
