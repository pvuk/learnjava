package com.java.exception.trycatch;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 17-September-2025 11:48:34
 */
public class ExceptionTryCatchSubLevel {
	public static void main(String[] args) {
		try {
			//NumberFormatException
//			int number = Integer.parseInt("pants");//Coding with John
			
			//IllegalArgumentException
			long number = 50*90*10*20*30;
			if(number < 999111000) {
				throw new IllegalArgumentException("Number can't be less than 999111000: "+ number);
			}
			
			System.out.println("Number: "+ number);
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException: Message: "+ e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException: Message: "+ e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("RuntimeException: Message: "+ e.getMessage());
		} catch (Exception e) {
			System.err.println("Exception: Message: "+ e.getMessage());
		} catch (Throwable e) {
			System.err.println("Throwable: Message: "+ e.getMessage());
		}
	}
}
