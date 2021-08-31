package com.java.designpatterns.observer;

public class RunObserverPattern {

    public static void main(String[] args) {
        MessageSubscriberOne msOne = new MessageSubscriberOne();
        MessageSubscriberTwo msTwo = new MessageSubscriberTwo();
        MessageSubscriberThree msThree = new MessageSubscriberThree();

        MessageWeatherObservable mwObservable = new MessageWeatherObservable();
        mwObservable.add(msOne);
        mwObservable.add(msTwo);

        mwObservable.notifyUpdate(new Message("Hyderabad Weather 24 °C | °F"));//msOne and msTwo will receive the update

        mwObservable.remove(msOne);//Removing Observer
        mwObservable.add(msThree);

        mwObservable.notifyUpdate(new Message("Hyderabad Weather 23 °C | °F"));//msTwo and msThree will receive the update
    }
}
