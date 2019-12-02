package com.practice.java.interview.productbased.adp;

/**
 * Q. 3 Where will be the most chance of the garbage collector being invoked ?
 * A. After line 9
 * B. After line 10
 * C. After line 11
 * D. Garbage collector never invoked in methodA()
 * Ans:
 * 
 * @author Priyanka
 *
 * @date Thu 07-Nov-2019 19:32
 */
public class WhenGarbageCollectorInvoked {

	public static void main(String[] args) {
		WhenGarbageCollectorInvoked h = new WhenGarbageCollectorInvoked();
		Object methodA = h.methodA(); /* Line 6 */
		System.out.println(methodA);
	}

	private Object methodA() {
		Object obj1 = new Object();	/* Line 7 */
		Object[] obj2 = new Object[1];	/* Line 8 */
		obj2[0] = obj1;	/* Line 9 */
		obj1 = null;	/* Line 10 */
		return obj2[0];	/* Line 11 */
	}
}
