package com.java.interview.coforge;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Thu 19-Jun-2025 17:05
 * 
 */
public class ArrayStringSort {
	public static void main(String[] args) {
		String str = "a, b, b, a, a";
		//create array, a left side
		//a, a, a, b, b
//		Arrays.asList(str.split(", ")).stream().
		String[] split = str.split(", ");
//		Set<String> set = new HashSet<String>();
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		LinkedList<String> linkedList = new LinkedList<String>();
		
		//Bubble sort algorithm
		for(int i = 0; i < split.length; i++) {
//			set.add(split[i]);
//			map.put(i, split[i]);
//			linkedList.add(split[i]);
			/*
			 * That specific condition j < arr.length - i - 1 is a crucial part of the bubble sort algorithm. Let me break it down for you:

				🔁 Why arr.length - i - 1?
				In bubble sort, we compare adjacent elements and "bubble up" the largest ones toward the end. With every outer loop iteration (i), the last i elements are already sorted—so there's no need to compare them again.
				✅ So:
				- arr.length → total number of elements
				- - i → because the last i items are sorted already
				- - 1 → because you're comparing arr[j] with arr[j+1], so j must stop before the last index

				More Info...
				It's a nice optimization—skipping redundant comparisons makes the loop more efficient. 
			 */
			for(int j = 0; j < split.length - 1 - i; j++) {
				//swap
				System.out.println(split[j] +": "+ split[j + 1] +":"+ split[j].compareTo(split[j + 1]));
				
				if(split[j].compareTo(split[j + 1]) > 0) {
					String temp = split[j];
					split[j] = split[j+1];
					split[j+1] = temp;
				}
			}
		}
		for(String s : split) {
			System.out.print(s);
		}
//		set.forEach(s -> System.out.println(s));
//		map.forEach((k, v) -> System.out.print(v));
//		linkedList.forEach(s -> System.out.println(s));
	}
}
