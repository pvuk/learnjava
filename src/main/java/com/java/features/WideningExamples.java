package com.java.features;

/**
 * Code Ref: IntStream.rangeClosed('A', 'Z') input paramtype int but it allows 'A' how ?
 * 
 * this is a core Java type-conversion concept.
	Short answer:
	👉 'A' is a char, and char is implicitly converted to int in Java.

	Let’s break it down clearly.
	1️⃣ Method signature of IntStream.rangeClosed
	IntStream.rangeClosed(int startInclusive, int endInclusive)
	✅ The method accepts int parameters only.
	
	2️⃣ Then why does 'A' work?
	Because: 
	'A'  --> char

	In Java:
	
	char is a 16-bit unsigned integer
	Range: 0 to 65535
	It represents a Unicode code point
	
	So when you write:
	IntStream.rangeClosed('A', 'Z')
	
	Java automatically converts:
	'A' → 65
	'Z' → 90
	
	This is called implicit widening primitive conversion.
	✅ char → int is always allowed
	❌ int → char is NOT implicit (possible data loss)
	
	So this line:
	IntStream.rangeClosed('A', 'Z')
	
	Is exactly equivalent to:
	IntStream.rangeClosed(65, 90)
	
	4️⃣ Why Java allows this (language rule)
	Java permits widening conversions automatically:
	byte → short → int → long → float → double
	char → int → long → float → double
	
	
	Because widening:
	
	Never loses data
	Is type-safe
	
	5️⃣ Practical example
	IntStream.rangeClosed('A', 'Z')
	         .mapToObj(i -> (char) i)
	         .forEach(System.out::print);
	         
	Output:
	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	
	👉 Note the explicit cast back to char, because IntStream works with int.

 6️⃣ Important clarification (common confusion)
	🚫 This is NOT autoboxing
	🚫 This is NOT method overloading
	✔ This is primitive widening conversion
	There is no overload like:
	rangeClosed(char, char)
	
	Java just converts char → int before the method call.
	</br>---------------------------------------------------------</br>
			
	
	Code Ref: 🧠 Interview One‑Liners

	Widening conversion is automatic and safe
	char is a numeric type in Java
	char → int uses Unicode value
	No explicit cast needed in widening

	</br>
	//1️⃣ Size and range of byte
		 * <h3>Java Primitive Type: byte</h3>
		 *
		 * <table border="1">
		 *   <tr>
		 *     <th>Type</th>
		 *     <th>Bits</th>
		 *     <th>Range</th>
		 *   </tr>
		 *   <tr>
		 *     <td>byte</td>
		 *     <td>8 bits</td>
		 *     <td>-128 to 127</td>
		 *   </tr>
		 * </table>
		 *
		 * <p>
		 * The <code>byte</code> data type uses 8 bits and follows two's complement
		 * representation, allowing values from -128 to 127.
		 * </p>
		 * 
		 * Your value: i = 300   ❌ (outside byte range)
		 * 
		 * So Java cannot fit 300 into 8 bits safely.
		 *
		 * 2️⃣ What Java actually does (important!)
			When you cast int to byte, Java keeps only the lowest 8 bits of the integer and discards the rest.
			Binary representation of 300 (int, 32 bits)
			
			300 (decimal) = 00000000 00000000 00000001 00101100
			
			Keep only last 8 bits (for byte)
			00101100
			
			This binary value is:
			00101100 = 44 (decimal)
			
			✅ So the result is:
			byte b = 44;
			
			3️⃣ Proof with code
			int i = 300;
			byte b = (byte) i;
			
			System.out.println(b); // 44
			
			
			✔ Output: 44
			
			👉 300 became 44 → that’s data loss
			</br>---------------------------------------------------------</br>
		 * 
		 * 
		Code Ref: Key differences recap
		✅ Widening (safe)
			byte → int
			char → int
			int → long

		* . Automatic
		* . No data loss
		
		❌ Narrowing (unsafe)
			int → byte
			long → int
			double → int
		* . Explicit cast required
		* . Data loss possible ✅ (your case)
		
		</br><b>Interview‑ready explanation ✅</b>
		When converting an int to a byte, Java keeps only the lowest 8 bits of the integer. Since byte can represent values only from –128 to 127, values like 300 overflow and wrap around, causing data loss.


 * @author Venkata.Pulipati
 * @since Tuesday 14-April-2026 12:11:54
 */
public class WideningExamples {
	public static void main(String[] args) {
		//1️⃣ byte → int
		byte b = 10;
		int i = b;   // widening
		System.out.println(i);
		//✅ Allowed automatically
		
		//2️⃣ short → long
		short s = 2000;
		long l = s;  // widening
		System.out.println(l);
		
		//3️⃣ char → int  ✅ (your case)
		char c = 'A';   // Unicode = 65
		int ascii = c;
		System.out.println(ascii);  // 65
		//✔ char is numeric
		//✔ Converted using Unicode value
		
		//4️⃣ int → long
		int x = 100000;
		long y = x;
		System.out.println(y);
		
		//5️⃣ int → double
		int n = 25;
		double d = n;
		System.out.println(d);  // 25.0
		
		//6️⃣ float → double
		float f = 10.5f;
		double dou = f;
		System.out.println(dou);
		
		//7️⃣ Method call example (very common)

		int xParam = 50;
		printNumber(xParam);  // int → double (widening)
		//✔ No cast required
		
		
	}

	static void printNumber(double d) {
	    System.out.println(d);
	}

}
