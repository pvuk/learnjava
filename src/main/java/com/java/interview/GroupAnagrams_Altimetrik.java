package com.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 
	Example 1:
	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	Explanation:
	There is no string in strs that can be rearranged to form "bat".
	The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
	The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
	Example 2:
	Input: strs = [""]
	Output: [[""]]
	Example 3:
	Input: strs = ["a"]
	Output: [["a"]]
	 
	Constraints:
	1 <= strs.length <= 104
	0 <= strs[i].length <= 100
	strs[i] consists of lowercase English letters.

 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Thursday 06-August-2026 15:45:44
 */
public class GroupAnagrams_Altimetrik {
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams);
	}
	
	/**
	 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 * 
	 * @author PULIPATI VENKATA UDAYKIRAN
	 * @since Thursday 06-August-2026 16:41:16
	 * @param strs
	 * @return
	 */
	private static Map<String, List<String>> groupAnagrams(String[] strs) {
	    Map<String, List<String>> map = new HashMap<>();
	    for (String word : strs) {
	        // Sort the characters of the word to create a key
	        char[] chars = word.toCharArray();
	        Arrays.sort(chars);
	        String sortedKey = new String(chars);

	        // Add the word to the corresponding group
	        map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
	    }
	    return map;
	}
}
