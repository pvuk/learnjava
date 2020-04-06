package com.java.interview.servicebased.facetoface.infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date Tue 31-Mar-2020 16:39
 *
 */
public class ConvertListToMapUsingLambda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("4");
		list.add("5");
		list.add("7");
		
		try {
			// or Collectors.toMap(x -> x, String::valueOf)
			Map<String, String> mapFromList = list.stream().collect(Collectors.toMap(x -> x, x -> x));
			System.out.println(mapFromList);
		} finally {
			// TODO: handle finally clause
		}
		
		/**
		 * 1. To solve duplicate key issue above, pass in third mergeFunction argument like this
		 * 
		 * Note: (oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
		 * 
		 * 2. Key is same in both cases, but value may change. Based on requirement use oldKey or newKey.
		 * 
		 */
		list.stream().collect(Collectors.toMap(x -> x, x -> x, (oldKeyValue, newKeyValue) -> oldKeyValue));
		
	}
}
