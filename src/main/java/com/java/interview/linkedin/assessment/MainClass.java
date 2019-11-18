package com.java.interview.linkedin.assessment;

//uncomment the code to get result
//Ans: Cannot reduce the visibility of the inherited method from MainInterface
class MainClass
//implements MainInterface 
{
	public static void main(String[] args) {
		new MainClass().print();
	}

	void print() {
		System.out.println("Hello!");
	}
}

//interface MainInterface {
//	abstract void print();
//}