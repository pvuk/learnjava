package com.java.interview.productbased.opentext;

import java.util.HashMap;

/**
 * <p>
 * 	Print following values using HashMap
 * 	M-25
 * 	T-10
 * 	F-12
 * 	S-15
 * 	V-12
 * </p>
 * @author P V UdayKiran
 *
 * @Date Sun 01-Dec-2019 19:40
 */
public class HowHashMapPrintTheData {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("M", 25);
		hashMap.put("T", 10);
		hashMap.put("F", 12);
		hashMap.put("S", 15);
		hashMap.put("V", 12);
//		System.out.println(hashMap);//{S=15, T=10, F=12, V=12, M=25}(Print format)
		// or
		hashMap.forEach((k, v) -> System.out.println(k + "-" + v));
	}
}
