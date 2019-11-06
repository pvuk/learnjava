package com.practice.java.exception.throwskeyword;

import java.io.IOException;
import java.util.Scanner;

public class HandleMultipleThrowsExceptions {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			System.out.println("Please enter Number: ");
			scanner = new Scanner(System.in);
			multipleThrows(scanner);
			System.out.println("Checking entered Number is Prime or not: ");
			scanner.close();
		}
//		catch (Exception e) {
//			// all sub-classes of Exceptions can handle here
//			e.printStackTrace();
//		}
		//Individual exception handling
		catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void multipleThrows(Scanner scanner) throws IOException, NullPointerException, ArithmeticException{
		try {
			int next = scanner.nextInt();
		} catch (Exception e) {
			throw new IOException("Please enter Numbers only.");
		}
		
	}
}
