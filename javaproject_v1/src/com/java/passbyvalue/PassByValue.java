package com.java.passbyvalue;

/**
 * <b>Link</b>
 * <a href=
 * 'https://www.javaworld.com/article/2077424/learn-java/learn-java-does-java-pass-by-reference-or-pass-by-value.html'>
 * learn-java-does-java-pass-by-reference-or-pass-by-value</a>
 * 
 * @author venkataudaykiranp
 *
 */
public class PassByValue {
	int x = 0;
	int y = 0;

	public PassByValue(int i, int j) {
		this.x = i;
		this.y = j;
	}

	public static void tricky(PassByValue arg1, PassByValue arg2) {
		arg1.x = 100;
		arg1.y = 50;
		PassByValue temp = arg1;
		arg1 = arg2;
		arg2 = temp;
	}

	public static void main(String[] args) {
		PassByValue pnt1 = new PassByValue(0, 0);
		PassByValue pnt2 = new PassByValue(0, 0);
		System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
		System.out.println(" ");
		tricky(pnt1, pnt2);
		System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
	}
}
