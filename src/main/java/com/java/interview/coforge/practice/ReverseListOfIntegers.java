package com.java.interview.coforge.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 02-September-2025 15:54:35
 */
public class ReverseListOfIntegers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(426, 244, 327);//624, 442, 723
		list.stream().map(num -> Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())).forEach(System.out::println);
		
		System.out.println("Reverse Using Java");
		//Example
		List<Integer> collect = list.stream().map(num -> {
			/**
			 * ✅ Step 1: Initialization
			 * . rev will hold the reversed number.
			 * . Initially, it's set to 0.
			 */
			int rev = 0;
			/**
			 * ✅ Step 2: Loop until num becomes 0
			 * . This loop continues as long as num has digits left.
			 */
			while(num != 0) {
				/**
				 * ✅ Step 3: Extract the last digit
				 * num % 10
				 * .% is the modulo operator.
                 * .It gives the last digit of num.
                 * 
                 * For example, if num = 426, then num % 10 = 6.
                 * 
                 * SOME MORE INFO...
                 * Let's break down why:

					426 % 10 = 6
					
					The modulus operator (%) gives the remainder when one number is divided by another.
					
					So:
					
					426 ÷ 10 equals 42 with a remainder of 6
					That <b>remainder</b> is what % returns
					Here's how it works:
					10 goes into 426 42 times (because 10 × 42 = 420)
					What's left over? 426 - 420 = 6
					So:
					
					426 % 10 = 6
                 * 
                 * ✅ Step 4: Add the digit to rev
                 * rev = rev * 10 + num % 10;
                 * . Multiply rev by 10 to shift its digits left.
				 * . Add the extracted digit to the end.
				 * 
				 * Example:
					Initially: rev = 0
					After first iteration (num = 426): rev = 0 * 10 + 6 = 6
					After second iteration (num = 42): rev = 6 * 10 + 2 = 62
					After third iteration (num = 4): rev = 62 * 10 + 4 = 624
				 */
				rev = rev * 10 + num % 10;
				
				/**
				 * ✅ Step 5: Remove the last digit from num
				 * . num /= 10;
				 * 
				 * This divides num by 10 and removes the last digit.
				 * Example:
				 * num = 426 → 42 → 4 → 0
				 * 
				 * SOME MORE INFO...
				 * Let's break it down:

					You're dividing 426 by 10:
					
					Step-by-step:
					. When you divide a number by 10, you're essentially shifting the decimal point one place to the left.
					. So, for 426 ÷ 10, you move the decimal point:
						. 426 becomes 42.6
					<b>Why?</b>
					Because:
					
					. 426÷10 = 426/10 = 42.6
					
					This is the same as saying:
					
					. 10 goes into 426 42 times, with a remainder of 6, which becomes 0.6 when divided by 10.
				 */
				num /= 10;
			}
			return rev;
		}).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
