package com.java.designpatterns.observer;

/**
 * @author Pulipati Venkata UdayKiran
 * @since 31-Aug 2021 17:17
 * 
 * Observable also know as Subject
 * 
 * @apiNote
 * Code Reference: https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/
 * </br>
 * * Beautiful Video Reference: https://www.youtube.com/watch?v=_BpmfnqjgzQ&list=RDCMUCbF-4yQQAWw-UnuCd2Azfzg&index=3
 * 
 * Reference: https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/
 */
public interface Observable {

    public void add(Observer iObserver);
    public void remove(Observer iObserver);
    public void notifyUpdate(Message message);
}
