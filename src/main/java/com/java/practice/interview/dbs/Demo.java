package com.java.practice.interview.dbs;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 20:11
 */
public class Demo {
    public static void main(String args[]) {
        int result, x;
        x = 1;
        result = 0;
        while (x <= 10) {
            if (x % 2 == 0)
                result += x;
            ++x;
        }
        System.out.println(result);
    }
}