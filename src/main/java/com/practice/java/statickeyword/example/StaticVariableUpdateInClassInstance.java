package com.practice.java.statickeyword.example;

public class StaticVariableUpdateInClassInstance {
	
	static int i = 0;
	
	public StaticVariableUpdateInClassInstance() {
		i++;
	}
	
	public StaticVariableUpdateInClassInstance(int i) {
		StaticVariableUpdateInClassInstance.i = i++;
	}
	
	
	public static void main(String[] args) {
		System.out.println(StaticVariableUpdateInClassInstance.i);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		
		StaticVariableUpdateInClassInstance sv1 = new StaticVariableUpdateInClassInstance(1);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		
		StaticVariableUpdateInClassInstance sv2 = new StaticVariableUpdateInClassInstance(2);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		
		StaticVariableUpdateInClassInstance sv3 = new StaticVariableUpdateInClassInstance(3);
		System.out.println(StaticVariableUpdateInClassInstance.i);
		
		StaticVariableUpdateInClassInstance sv4 = new StaticVariableUpdateInClassInstance(4);
		System.out.println(StaticVariableUpdateInClassInstance.i);
	}
}
