package com.java.designpatterns.creational.factory;

/**
 * 2.2. Object implementations
 * 
 * Car is parent class of all car instances and it will also contain the common logic applicable in car making of all types.
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 26-Sep-2021 19:11
 */
public abstract class Car {
 
    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
 
    private void arrangeParts() {
        System.out.println("arrangeParts called");
    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
    private CarType model = null;
 
    public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }
}