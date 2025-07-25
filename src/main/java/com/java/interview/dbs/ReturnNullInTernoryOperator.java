package com.java.interview.dbs;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 20:11
 */
public class ReturnNullInTernoryOperator {
    
    public static void main(String[] args) throws Exception {
                    Boolean b = true ? returnsNull() : false;
                    System.out.println(b);
    }
    public static Boolean returnsNull() {
                    return null;
    }
}