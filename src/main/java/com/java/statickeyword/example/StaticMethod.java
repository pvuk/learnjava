package com.java.statickeyword.example;

/**
 * 
 * @author venkataudaykiranp
 * 
 * Refe: <a href="https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/">Java Static Methods</a>
 *
 */
public class StaticMethod {
	
	private static String value = "1234";
	private String value2 = "5678";
	
	/**
	 * Static method
	 * @param value
	 * @return value
	 */
	public static String getData(String value) {
		return value;
	}
	
	public String getNonStaticData(String value) {
		return value;
	}
	
	public String getStaticMethodDataUsingNonStaticMethod(String value) {
		return getData(value);
	}
	
	public static void main(String[] args) {
		System.out.println("Static value Accessing using Static instance: "+ getData(StaticMethod.value));
		System.out.println("Non-Static value Accessing using instance: "+ getData(new StaticMethod().value2));
		System.out.println("Static Method Access without Class Instance: "+ StaticMethod.getData(value));
		
		System.out.println("Accessing NonStaticMethod with Class Instance: "+ new StaticMethod().getNonStaticData(value));
		System.out.println("Accessing StaticMethodData Using NonStaticMethod with Class Instance: "+ new StaticMethod().getStaticMethodDataUsingNonStaticMethod(value));
	}
}
