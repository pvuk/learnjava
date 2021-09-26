package com.java.designpatterns.creational.factory;

/**
 * SmallCar is concrete implementation of car type SMALL.
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:13
 */
public class SmallCar extends Car {
 
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}