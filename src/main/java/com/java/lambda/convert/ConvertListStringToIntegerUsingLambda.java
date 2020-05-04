package com.java.lambda.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Convert List<String>
 * @author P V UdayKiran
 *
 * @Date Tue 31-Mar-2020 16:49
 *
 */
public class ConvertListStringToIntegerUsingLambda {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("1");
//		list.add("4");
//		list.add("5");
//		list.add("7");
		
		//or other way to add data to list
		List<String> list = new ArrayList<String>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			//int i = 2;

		{
			add("1");
			add("4");
			add("5");
			add("7");
		}};
		
		IntStream listToMapThenToInt = list.stream().mapToInt(Integer::valueOf);
		listToMapThenToInt.forEach(System.out::print);
	}
}
