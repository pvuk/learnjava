package com.java.practice.interview.dbs;

class Beta {
}

class Alpha {
	static Beta b1;
	Beta b2;
}

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 20:11
 */
public class Tester {
	public static void main(String[] args) {
		Beta b1 = new Beta();
		Beta b2 = new Beta();
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		a1.b1 = b1;
		a1.b2 = b1;
		a2.b2 = b2;
		a1 = null;
		b1 = null;
		b2 = null;
// do stuff
	}
}