package com.java.lambda.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Sat 12-Sep-2020 06:40
 * 
 * <p>Q: Write a program whose sum of List<Integer> values equal to Key. Using Map<Integer, List<Integer>>.</br>
 * 
 * <b>Output:</b> {119=[34, 39, 46], 184=[77, 53, 54], 252=[95, 85, 72], 205=[31, 81, 93], 190=[28, 95, 67]}
 * </p>
 */
public class SumOfListIntegerEqualToKey {
	
	public static void main(String[] args) {
		int upperBound = 100;// Max random number
		Random random = new Random();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> integers = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			Integer reduce = 0;
			for(int j = 0; j < 3; j++) {
				int nextInt = random.nextInt(upperBound);
				integers.add(nextInt);
				
				if(j == 2) {
					reduce = integers.stream().reduce(0, Integer::sum);
					
					//if key exist restart the loop. Make sure Map should contain 5 key's.
					if(map.containsKey(reduce)) {
						j = 0;
					}
				}
			}
			map.put(reduce, integers);
			integers = new ArrayList<Integer>();
		}
		System.out.println(map);
	}
}
