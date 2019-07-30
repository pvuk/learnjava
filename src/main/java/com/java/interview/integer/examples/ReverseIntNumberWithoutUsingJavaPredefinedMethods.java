package com.java.interview.integer.examples;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>Company: ATMECS, LancoHills, Hyderabad</p>
 * <a href="https://stackoverflow.com/questions/3806126/java-reverse-an-int-value-without-using-array">Java reverse an int value without using array</a>
 * @version 1.0 31-Mar-2019
 *
 */
@Slf4j
public class ReverseIntNumberWithoutUsingJavaPredefinedMethods {
	public static void main(String[] args) {
		int reverse = 2489, lastNum = 0;
		while(reverse > 0) {
			lastNum = lastNum * 10 + reverse % 10;// % gets remainder
			log.info("Reverse: {}", reverse);
			reverse /= 10;// 2489 divide by 10 results 248.9, the return type is integer, it takes 248 as a result
		}
		log.info("LastNum: {}", lastNum);
	}
}
