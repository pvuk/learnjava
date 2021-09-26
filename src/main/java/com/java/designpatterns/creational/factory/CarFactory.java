package com.java.designpatterns.creational.factory;

/**
 * 2.3. Factory to create objects
 * 
 * CarFactory.java is our main class implemented using factory pattern. It instantiates a car instance only after determining its type.
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:14
 */
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case SMALL:
            car = new SmallCar();
            break;
 
        case SEDAN:
            car = new SedanCar();
            break;
 
        case LUXURY:
            car = new LuxuryCar();
            break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }
}