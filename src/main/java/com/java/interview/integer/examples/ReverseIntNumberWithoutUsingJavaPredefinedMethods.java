package com.java.interview.integer.examples;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>Company: ATMECS, LancoHills, Hyderabad</p>
 * <a href="https://stackoverflow.com/questions/3806126/java-reverse-an-int-value-without-using-array">Java reverse an int value without using array</a>
 * @version 2.0 03-Dec-2019
 *
 */
@Slf4j
public class ReverseIntNumberWithoutUsingJavaPredefinedMethods {
	public static void main(String[] args) {
		int number = 2489, reverse = 0;
		String strReverseNum = "";
		while(number > 0) {
			reverse = reverse * 10 + number % 10;// % gets remainder
			strReverseNum += String.valueOf(number % 10);//Using String 2000 reverse 0002
//			log.info("Reverse: {}", reverse);
			number /= 10;// 2489 divide by 10 results 248.9, the return type is integer, it takes 248 as a result
		}
		log.info("LastNum Using int: {}", reverse);
		log.info("LastNum Using String: {}", strReverseNum);
	}
}
