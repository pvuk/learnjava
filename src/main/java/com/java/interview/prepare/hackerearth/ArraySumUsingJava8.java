package com.java.interview.prepare.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Mon 21-Sep-2020 09:36
 */
public class ArraySumUsingJava8 {
	public static void main(String[] args) {
		System.out.println("How many values you want to Sum Of : ");
		Scanner s = new Scanner(System.in);
//		BufferedReader brSumOfValues = new BufferedReader(new InputStreamReader(System.in));

		try {
			int readLine = Integer.parseInt(s.nextLine());
//			System.out.format("Please enter %d digits with length of 10 with Space. For ex. 1000000001  : ", readLine);
			
			long sumUsingJava8Lambda = Arrays.stream(s.nextLine().split(" ")).mapToLong(Long::parseLong).sum();
			System.out.println("Sum: "+ sumUsingJava8Lambda);
			
//			Scanner s = new Scanner(System.in);
//	        long num=0;
//	        int n = Integer.parseInt(s.nextLine());
//	        String str[] = s.nextLine().split(" ");
//	        for(int i=0;i<str.length;i++)
//	            num += Long.parseLong(str[i]);
//	        System.out.println(num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
