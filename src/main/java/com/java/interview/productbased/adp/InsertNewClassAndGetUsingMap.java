package com.java.interview.productbased.adp;

import java.util.HashMap;
import java.util.Map;

/**
 * Return Test Q.13
 * 
 * @author Priyanka
 *
 * @date Thu 07-Nov-2019 19:12
 */
public class InsertNewClassAndGetUsingMap {
	public static void main(String[] args) {
		Map<JobDescription, String> map = new HashMap<JobDescription, String>();
		map.put(new JobDescription("1"), "John");
		
		String employeeName = map.get(new JobDescription("1"));
		/**
		 * What is the output of above code:
		 * A. John
		 * B. Exception would be thrown
		 * C. null
		 * D. None of the above
		 * 
		 * Output: null
		 */
		System.out.println(employeeName);
	}
}
