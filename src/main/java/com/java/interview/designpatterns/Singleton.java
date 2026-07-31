package com.java.interview.designpatterns;
/**
 * Cloning  </br>
	If the Singleton class implements Cloneable, calling clone() can create a new instance.</br>

 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Wednesday 22-July-2026 15:24:05
 */
public class Singleton implements Cloneable {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() { return instance; }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // breaks singleton
    }
}
