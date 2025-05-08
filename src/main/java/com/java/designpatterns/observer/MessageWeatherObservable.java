package com.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:41
 */
public class MessageWeatherObservable implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer iObserver) {
    	System.out.println(iObserver.addingMessage());
        observers.add(iObserver);
    }

    @Override
    public void remove(Observer iObserver) {
    	System.out.println(iObserver.removeMessage());
        observers.remove(iObserver);
    }

    @Override
    public void notifyUpdate(Message message) {
       observers.stream().forEach(iObserver -> {iObserver.update(message);});
    }
    
}
