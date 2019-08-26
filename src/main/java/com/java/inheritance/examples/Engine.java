package com.java.inheritance.examples;
/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>Maruti class uses Engine object’s start() method via composition. We can say that Maruti class HAS-A Engine.</p>
 *
 */
public class Engine {
	public void start(){
		System.out.println("Engine Started:");
	}
	public void stop(){
		System.out.println("Engine Stopped:");
	}
}