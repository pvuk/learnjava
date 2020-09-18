package com.java.practice.interview.dbs;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 19:15
 */
public class StaticIntegerIncrement {
	private static int i;
    static{
                                                                    i =10;
                                                                    System.out.println("Static Block");
    }
    public static void main(String args[]) {
                                                                    i = i++;
                                                                    System.out.println("Main Method : " + i);
    }
}
