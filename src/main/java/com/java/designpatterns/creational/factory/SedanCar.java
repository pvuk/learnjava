package com.java.designpatterns.creational.factory;

/**
 * SedanCar is concrete implementation of car type SEDAN.
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:13
 */
public class SedanCar extends Car {
 
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}