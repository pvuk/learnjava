package com.java.interview.designpatterns;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton INSTANCE =
            new SerializableSingleton();

    private SerializableSingleton() {
        System.out.println("Constructor called");
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }
    
    /*
     * 4️⃣ ✅ Solution: readResolve() method
Java provides a special hook method:
readResolve()

It is called after deserialization and allows you to return the existing instance.</br>

     * 5️⃣ Fixed Singleton (✅ Safe)
     * 
     * uncomment below code
     * ✅ Output after fix
     * System.out.println(s1 == s2);// true
     * ✅ Singleton preserved</br>
     * 
     */
//    // ✅ Fix for serialization
//     protected Object readResolve() {
//         return INSTANCE;
//     }

}