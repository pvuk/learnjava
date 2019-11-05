package com.practice.java.statickeyword.example;

//Java program to illustrate  
//static blank final variable 
public class UserLogin {
//	public static final long GUEST_ID = -1;
//	private static final long USER_ID;
//	static {
//		try {
//			USER_ID = getID();
//		} catch (IdNotFound e) {
//			USER_ID = GUEST_ID;
//			System.out.println("Logging in as guest");
//		}
//	}
//
//	private static long getID() throws IdNotFound {
//		throw new IdNotFound();
//	}
//
//	public static void main(String[] args) {
//		System.out.println("User ID: " + USER_ID);
//	}
}

class IdNotFound extends Exception {
	IdNotFound() {
	}
}

