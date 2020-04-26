package com.java.practice.interview.online.question.techwave;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * Write a function <tt style="white-space:pre-wrap">solution</tt> that, given
 * an integer N, returns the maximum possible value obtained by inserting one
 * '5' digit inside the decimal representation of integer N.
 * </p>
 * <p>
 * <b>Examples:</b>
 * </p>
 * <p>
 * 1. Given N = 268, the function should return <b>5</b>268.
 * </p>
 * <p>
 * 2. Given N = 670, the function should return 67<b>5</b>0.
 * </p>
 * <p>
 * 3. Given N = 0, the function should return <b>5</b>0.
 * </p>
 * <p>
 * 4. Given N = −999, the function should return −<b>5</b>999.
 * </p>
 * <p>
 * Assume that:
 * </p>
 * <blockquote>
 * <ul style="margin: 10px;padding: 0px;">
 * <li>N is an integer within the range
 * [<span class="number">−8,000</span>..<span class="number">8,000</span>].</li>
 * </ul>
 * </blockquote>
 * <p>
 * In your solution, focus on <b><b>correctness</b></b>. The performance of your
 * solution will not be the focus of the assessment.
 * </p>
 * 
 * @author P V UdayKiran
 *
 * @Date Sun 26-Apr-2020 17:42
 * 
 */
public class ReturnMaxPossibleValueObtainedByInserting5InsideDecimalRepresentation {
	public static void main(String[] args) {

		int given_value = 2684578;
		int solution = solution(given_value);
	}

	private static int solution(int given_value) {
		int display_value = 0;

		List<Integer> list = new ArrayList<Integer>();

		while (given_value != 0)

		{

			display_value = given_value % 1000;

			list.add(display_value);

			given_value /= 1000;

		}

		int length = String.valueOf(given_value).length();

//		IntStream.of(given_value)
//					.filter(x -> x != 0)
////					.limit(length)
//					.forEach(x -> {
//						int y = x % 1000;
//						list.add(y);
//						x /= 1000;
//					});

		list.add(0, 5);

		int result = list.stream().collect(Collectors.summingInt(Integer::intValue));

		for (Integer i : list) {
			System.out.print(i);
		}
		return 0;
	}
}