package com.java.interview.linkedin.assessment;

class NonStaticMethod {
	final String message() {
		return "Hello!";
	}
}

// uncomment to get code execute
class AccessNonStaticMethodFromStaticMethod extends NonStaticMethod {
	public static void main(String[] args) {
//     System.out.println(message());
	}

//  String message(){
//    return "World!";
//  }
}
