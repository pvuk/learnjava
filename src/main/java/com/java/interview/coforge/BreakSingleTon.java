package com.java.interview.coforge;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 1️⃣ Purpose of This Code</br>
	The class name BreakSingleTon itself gives the intent:</br>
	
		👉 To show how Java Reflection can break the Singleton design pattern.</br>
	
	A Singleton ensures that only one instance of a class exists in the JVM.</br>
	Reflection can bypass encapsulation (private constructors) and create new instances, thus violating Singleton rules.</br>
	
	
	<h3>6️⃣ Why Reflection Can Break Singleton</h3>
 *
 * <table border="1">
 *   <tr>
 *     <th>Reason</th>
 *     <th>Explanation</th>
 *   </tr>
 *   <tr>
 *     <td>Private visibility</td>
 *     <td>Prevents normal object creation using the <b>new</b> keyword</td>
 *   </tr>
 *   <tr>
 *     <td>Reflection</td>
 *     <td>Ignores Java access modifiers</td>
 *   </tr>
 *   <tr>
 *     <td>setAccessible(true)</td>
 *     <td>Overrides JVM access and security checks</td>
 *   </tr>
 *   <tr>
 *     <td>newInstance()</td>
 *     <td>Directly invokes the private constructor</td>
 *   </tr>
 * </table>
 * 
 * @author Venkata.Pulipati
 * @since Friday 19-September-2025 13:57:49
 */
public class BreakSingleTon {
	public static void main(String[] args) {
		try {
			/*
			 * 🔹 Step 1: Normal Singleton Usage
			 * . Calls the Singleton’s factory method
			 * . instanceOne now holds the only legitimate instance
			 */
			SinglePattern instanceOne = SinglePattern.getInstance();
			
			/*
			 * 🔹 Step 2: Getting the Private Constructor via Reflection
			 * . getDeclaredConstructor():
			 *	. Fetches private constructor
			 *	. Normally inaccessible
			 */
			Constructor<SinglePattern> constructor = SinglePattern.class.getDeclaredConstructor();
			
			/*
			 * 🔹 Step 3: Breaking Encapsulation
			 * 	. 🚨 Critical line
			 * 	. Bypasses Java access checks
			 * 	. Allows calling a private constructor
			 * This is exactly how reflection breaks encapsulation.
			 */
			constructor.setAccessible(true);
			
			/*
			 * 🔹 Step 4: throws InvocationTargetException. Read catch block comment.
			 * 
			 */
			SinglePattern instanceTwo = constructor.newInstance();
			
			/*
			 * 🚨 Singleton broken!
			 * Two different objects were created.
			 */
			System.out.println(instanceOne == instanceTwo);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		/*
		 * 5️⃣ Interview‑Ready Explanation ✅

		Why does newInstance() throw InvocationTargetException even if constructor has no exception?
		
		✅ Because reflection must handle the possibility that the constructor throws an exception internally
		✅ Java wraps constructor exceptions inside InvocationTargetException
		✅ This preserves separation between reflection errors and business logic errors

		 */
		catch (InvocationTargetException e) {
			System.out.println("Constructor threw exception: " + e.getTargetException());
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
		
		/*
		 * 🧠 Interview‑Ready Explanation (Use This ✅)

		Q: Why can’t we call getTargetException() on ReflectiveOperationException?
		
		✅ Because getTargetException() is defined only in InvocationTargetException
		✅ ReflectiveOperationException is a generic parent for many reflection errors
		✅ Therefore, you must either:
		
		catch InvocationTargetException separately, OR
		use getCause() safely
		 */
//		catch (ReflectiveOperationException e) {
//			System.out.println("Constructor threw exception: " + ((InvocationTargetException) e).getTargetException());
//		}
		
		catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
