package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Finding the Longest Increasing Subsequence (LIS) using Java Stream reductions is an interesting functional-style exercise, though LIS is inherently a dynamic programming problem and not naturally suited for pure reductions.
	Still, you can approximate or implement LIS logic using streams with a custom accumulator.</br>
	
	✅ Example Walkthrough</br>
	Input:</br>
	[10, 9, 2, 5, 3, 7, 101, 18]</br>
	
	Tails evolution:</br>
	[10]
	[9]
	[2]
	[2,5]
	[2,3]
	[2,3,7]
	[2,3,7,101]
	[2,3,7,18]
	
	Final size = 4 ✅</br>
	
	More Info...</br>
	✅ 1. What is a Subsequence?</br>
	👉 Definition:</br>
	A subsequence is a sequence derived from the original array by:</br>
	
		. keeping order same
		. but can skip elements
	
	👉 You do NOT need contiguous elements</br>
	
	✅ Example</br>
	Array:</br>
	[10, 9, 2, 5, 3, 7]</br>
	
	Valid subsequences:</br>
	[10, 9, 5]
	[2, 3, 7] ✅</br>
	[9, 5, 7] ✅</br>
	
	Invalid:</br>
	[5, 2] ❌ (order changed)</br>
	
	✅ 2. What is Increasing Subsequence?</br>
	A subsequence where:</br>
	next element > previous element</br>
	
	
	✅ Examples</br>
	[2, 5, 7] ✅ increasing</br>
	[9, 10] ✅ increasing (but order matters!)</br>
	[10, 9] ❌ decreasing</br>
	
	✅ 3. Why NOT [10, 9, 5] ?</br>
	Your question 👇</br>
	👉 Why not take:</br>
	[10, 9, 5]</br>
	
	❌ Reason:</br>
	It is NOT increasing</br>
	10 → 9 ❌ (decreasing)</br>
	9 → 5 ❌ (decreasing)</br>
	
	👉 LIS requires:</br>
	strictly increasing values</br>
	
	✅ 4. What is the correct LIS for your example?</br>
	Input:</br>
	[10, 9, 2, 5, 3, 7, 101, 18]</br>
	
	✅ Valid increasing subsequences:</br>
	[2, 5, 7, 101] ✅ (length 4)</br>
	[2, 3, 7, 18] ✅ (length 4)</br>
	
	👉 Answer = 4</br>
	
	✅ 6. Why did 10, 9, 5 disappear?</br>
	Let’s see:</br>
	Step-by-step:
	Start: []
	
	10 → [10]
	9  → [9]      (replaces 10 → smaller is better)
	2  → [2]      (replaces 9)
	5  → [2,5]
	3  → [2,3]    (replace 5)
	7  → [2,3,7]
	101→[2,3,7,101]
	18 →[2,3,7,18]</br>
	
	✅ Why replace 10 → 9 → 2 ?</br>
	👉 Because:</br>
	We want smallest possible starting number</br>
	Why?</br>
	👉 Smaller start → more chance to extend sequence</br>
	
	✅ 7. Key Insight (Interview GOLD ⚡)</br>

	“The algorithm doesn't store actual subsequences — it maintains the smallest possible tail values for increasing sequences of each length.”</br>
	
	Key Rule (VERY IMPORTANT 🔥)</br>
	👉 Subsequence ≠ Increasing Subsequence</br>
	
	. Subsequence → just order matters</br>
	. LIS → order + strictly increasing</br>
	
 * @author Venkata.Pulipati
 * @since Monday 11-May-2026 14:20:42
 */
public class FindLongestIncreasingSubsequence {
	public static void main(String[] args) {

		int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
		
        streamReductionSolution(arr.clone());//Example 1
        
        lisFunctional(arr.clone());//Example 2
        
        lis(arr.clone());//Example 3
	}
	
	/**
	 * ✅ Approach Idea</br>
	We maintain a structure (like a list of LIS tails) and update it using a reduction.
	👉 Standard LIS logic (efficient O(nlog⁡n)O(n \log n)O(nlogn)) uses:
	
	A list tails
	Binary search to place each element
	
	We can adapt this into a stream reduce().</br>
	
	 * ✅ How This Works</br>
			Step-by-step:</br>
			
			. We reduce the stream into a list (tails)</br>
			. For each element:</br>
				.Find position using binarySearch</br>
				.Replace or append</br>
			
			. Final list size = LIS length</br>
			
	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 14:29:48
	 * @param arr
	 */
	private static void streamReductionSolution(int[] arr) {
        int lisLength = Arrays.stream(arr)
                .boxed()
                .reduce(
                        new ArrayList<Integer>(), // identity
                        (tails, num) -> {
                            int idx = Collections.binarySearch(tails, num);
                            
                            if (idx < 0) {
                                idx = -(idx + 1); // insertion point
                            }

                            if (idx == tails.size()) {
                                tails.add(num);
                            } else {
                                tails.set(idx, num);
                            }

                            return tails;
                        },
                        (left, right) -> left // combiner (not used for sequential)
                )
                .size();

        System.out.println("LIS Length: " + lisLength);
	}
	
	/**
	 * ✅ More Functional (But Less Efficient) Version (O(n²))</br>
		If you want a more functional-friendly version:

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 14:33:25
	 * @param nums
	 * @return
	 */
	public static int lisFunctional(int[] nums) {
	    List<Integer> dp = new ArrayList<>();

	    Arrays.stream(nums).forEach(num -> {
	        int max = 1;
	        for (int i = 0; i < dp.size(); i++) {
	            if (nums[i] < num) {
	                max = Math.max(max, dp.get(i) + 1);
	            }
	        }
	        dp.add(max);
	    });

	    return dp.stream().max(Integer::compareTo).orElse(0);
	}

	public static int lis(int[] nums) {
	    List<Integer> tails = new ArrayList<>();

	    for (int num : nums) {
	        int idx = Collections.binarySearch(tails, num);
	        if (idx < 0) idx = -(idx + 1);

	        if (idx == tails.size()) {
	            tails.add(num);
	        } else {
	            tails.set(idx, num);
	        }
	    }
	    return tails.size();
	}

}
