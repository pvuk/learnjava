package com.java.string.immutable.example;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>
 * 	<a href="https://www.javatpoint.com/immutable-string">Immutable String in Java</a>
 * 	<br>
 * <a href="https://stackoverflow.com/questions/8798403/string-is-immutable-what-exactly-is-the-meaning#answer-17942294">String is immutable. What exactly is the meaning? [duplicate]</a>	
 * </p>
 */
@Slf4j
public class StringImmutableExample {
	
	public static void main(String[] args) {
		String s1 = "abc";
		log.info("s1 value: {}, s1 hashcode: {}", s1, s1.hashCode());
//		String s2 = "ABC";
//		log.info("ABC value: {}, hashcode: {}", s2, s2.hashCode());
		log.info("Trying to change s1 value from: {} to .toUpperCase(): {} without assigning to s1 and s1 hashcode {}", s1, s1.toUpperCase(), s1.hashCode());
		
		log.info("Trying to change s1 value from: {} to .toUpperCase(): {} by assigning, s1 hashcode: {}", s1, s1 = s1.toUpperCase(), s1.hashCode());
		
		
		System.out.println("===================================================================");
		
		
		String firstName = "Mahendra Singh";
		log.info("firstName: {}, firstName hashcode: {}", firstName, firstName.hashCode());
		
		String lastName = " Dhoni";
		firstName.concat(lastName);
		log.info("concat firstName: {} with lastName: {} without assign to firstName, firstName hashcode: {}", firstName, lastName, firstName.hashCode());
		log.warn("In above case, Please notice that still \"Mahendra Singh \" object is not modified.");
		
		log.info("concat firstName: {} with lastName: {} and assigning to firstName: {}, firstName hashcode: {}",
				firstName, lastName, firstName = firstName.concat(lastName), firstName.hashCode());

		log.info("firstName: {}, firstName hashcode: {}, lastName: {}, lastName hashcode: {}", firstName, firstName.hashCode(), lastName, lastName.hashCode());
		
		
		System.out.println("===================================================================");
		
		
		String a = "test";
		int aHashCode = a.hashCode();
		log.info("a value: {}, a hashCode: {}", a, aHashCode);
		String b = "TEST";
		log.info("b value: {}, b hashCode: {}", b, b.hashCode());
		a = b;
		log.warn("b value \"TEST\" is to a. a value: {}, a hashCode: {}, b value: {}, b hashCode: {}", a, a.hashCode(), b, b.hashCode());
		log.warn("Previous a value \"test \" is initialized in c String value");
		String c = "test";
		int cHashCode = c.hashCode();
		log.info("c value: {}, c hashCode: {}", c, c.hashCode());
		if(aHashCode == cHashCode) {
			log.error("\"test\" value is taken from String cache pool");
		}
		
		System.out.println("===================================================================");
		
		
		String x = "Hello World!";
		String y = new String("Hello World!");
		String z = new String("Hello World!");
		
		String A = new String(x);
		String B = new String(y);
		
		String p = "Hello World!";
		String q = x;
		String r = p;
		
		log.info("\n x value: {}, x hashCode: {},\n y value: {}, y hashCode: {},\n z value: {}, z hashCode: {},\n A value: {}, A hashCode: {},\n B value: {}, B hashCode: {},"
				+ "\n p value: {}, p hashCode: {},\n q value: {}, q hashCode: {},\n r value: {}, r hashCode: {}",
				x, x.hashCode(), y, y.hashCode(), z, z.hashCode(), A, A.hashCode(), B, B.hashCode(), p, p.hashCode(), q, q.hashCode(), r, r.hashCode());
		log.info("[true / false condition] x equals y: {}, y equals z: {}, x equals A: {}, A equals B: {}, x equals p: {}, q equals r: {}",
				x.equals(y), y.equals(z), x.equals(A), A.equals(B), x.equals(p), q.equals(r));
		log.info("[true / false condition] x == y: {}, y == z: {}, x == A: {}, A == B: {}, x == p: {}, q == r: {}",
				x == y, y == z, x == A, A == B, x == p, q == r);
		
		System.out.println("===================================================================");
	}
}
