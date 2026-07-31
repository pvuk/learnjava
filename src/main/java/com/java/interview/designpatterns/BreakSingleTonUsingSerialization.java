package com.java.interview.designpatterns;
import java.io.*;

/**
 * Serialization/Deserialization</br>
   When a Singleton is serialized and then deserialized, a new object can be created.</br>
   
 * Serialization can break the Singleton pattern because Java’s deserialization process can create a new instance of a class, bypassing the Singleton’s private constructor.
 *	Below is a clear, step‑by‑step explanation with code.
	
 *	1️⃣ What is the problem?
 *	A Singleton guarantees only one object per JVM.
 *	But during deserialization, Java:
	
 * . Does not call the constructor
 * . Creates a new object from the byte stream
	
 *	👉 Result: Two different instances of a Singleton class.</br>

 * 3️⃣ Why does this happen?
	During deserialization:
	
	JVM creates the object directly from bytes
	Constructor is not invoked
	Static instance check is ignored
	
	So Java ends up creating a new object, even though one already exists.</br>
	
	* 6️⃣ Important interview points (⭐ remember this)</br>
	
	* . Serialization breaks Singleton by creating a new instance</br>
	* . Constructor is not called during deserialization</br>
	* . readResolve() ensures same instance is returned</br>
	* . Must be used only when class implements Serializable</br>
	* 
	* Interview‑ready (2–3 lines):</br>
	Serialization can break the Singleton pattern because deserialization creates a new object without calling the constructor.
	As a result, multiple instances are produced from the same class.
	This can be prevented by implementing the readResolve() method or by using an enum‑based Singleton.</br>
	* 
	* 7️⃣ Best & Safest Singleton: enum
	The strongest Singleton (immune to Serialization + Reflection):</br>
	
	8️⃣ Summary</br>
	| Topic            | Result                         |
	|------------------|--------------------------------|
	| Serialization    | ❌ Breaks Singleton             |
	| Reason           | Deserialization creates new object |
	| Fix              | ✅ readResolve()               |
	| Best Practice    | ✅ enum Singleton              |</br>

 * @author venkata.pulipati
 * @since Tuesday 05-May-2026 13:00:03
 */
public class BreakSingleTonUsingSerialization {
    public static void main(String[] args) throws Exception {

        SerializableSingleton s1 =
                SerializableSingleton.getInstance();

        // Serialize
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("obj.ser"));
        out.writeObject(s1);
        out.close();

        // Deserialize
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("obj.ser"));
        SerializableSingleton s2 =
                (SerializableSingleton) in.readObject();
        in.close();

        /*
         * ✅ Two different objects created
		 * ✅ Singleton is broken
         */
        System.out.println(s1 == s2); // ❌ false
    }
}