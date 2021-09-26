package com.java.designpatterns.creational.factory;

/**
 * 2.4. Test factory pattern
 * 
 * In TestFactoryPattern, we will test our factory code. Lets run this class.
 * 
 * 1. When to use factory pattern?
 * 
 * Factory pattern introduces loose coupling between classes which is the most
 * important principle one should consider and apply while designing the
 * application architecture. Loose coupling can be introduced in application
 * architecture by programming against abstract entities rather than concrete
 * implementations. This not only makes our architecture more flexible but also
 * less fragile.
 * 
 * Code Reference:
 * https://howtodoinjava.com/design-patterns/creational/implementing-factory-design-pattern-in-java/
 * Video Reference: https://www.youtube.com/watch?v=EcFVTgRHJLM
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:15
 */
public class TestFactoryPattern {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}