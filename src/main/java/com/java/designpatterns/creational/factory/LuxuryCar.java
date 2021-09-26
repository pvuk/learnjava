package com.java.designpatterns.creational.factory;

/**
 * LuxuryCar is concrete implementation of car type LUXURY
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:12
 */
public class LuxuryCar extends Car {
 
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}