package com.java.finalkeyword.example;

/**
 * 
 * <a href=
 * "https://beginnersbook.com/2014/07/final-keyword-java-final-variable-method-class/">Whats
 * the use of blank final variable?</a>
 * <p>
 * Lets say we have a Student class which is having a field called Roll No.
 * Since Roll No should not be changed once the student is registered, we can
 * declare it as a final variable in a class but we cannot initialize roll no in
 * advance for all the students(otherwise all students would be having same roll
 * no). In such case we can declare roll no variable as blank final and we
 * initialize this value during object creation like this:
 * </p>
 * 
 * @author P V UdayKiran
 *
 * @since Fri 22-Nov-2019 20:26
 */
public class FinalConstantStudentData {

	final int ROLL_NO;

	public FinalConstantStudentData(int rNum) {
		this.ROLL_NO = rNum;
	}

	void studentDetails() {
		System.out.println("Roll no is: " + this.ROLL_NO);
	}

	public static void main(String[] args) {
		FinalConstantStudentData data = new FinalConstantStudentData(1234);
		data.studentDetails();

		FinalConstantStudentData data2 = new FinalConstantStudentData(2345);
		data2.studentDetails();
	}
}
