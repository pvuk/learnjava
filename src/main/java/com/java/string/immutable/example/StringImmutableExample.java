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
		log.info("abc value: {}, hashcode: {}", s1, s1.hashCode());
//		String s2 = "ABC";
//		log.info("ABC value: {}, hashcode: {}", s2, s2.hashCode());
		log.info("Trying to change abc value from {} to uppercase {} and hashcode {}", s1, s1.toUpperCase(), s1.hashCode());
		log.info("After update abc value: {}, hashcode: {}", s1, s1.hashCode());
		
		log.info("Trying to change abc value from {} to uppercase {} by assigning", s1, s1 = s1.toUpperCase());
		log.info("After update abc value assigning: {}, hashcode: {}", s1, s1.hashCode());
		
		String name = "Mahendra Singh ";
		log.info("name: {}, hashcode: {}", name, name.hashCode());
		name.concat("Dhoni");
		log.info("concat name \"Dhoni\" name: {}, hashcode: {}", name, name.hashCode());
		String firstName = name;
		log.info("Assigning name: {} to firstName: {}, hashcode: {}", firstName, firstName.hashCode());
		name = name.concat("Dhoni");
		log.info("contact name with \"Dhoni\" and assigning to name: {}, hashcode: {}", name, name.hashCode());
//		In such case, name points to the "Mahendra Singh Dhoni". Please notice that still "Mahendra Singh " object is not modified.
		log.info("name: {}, hashcode: {}, firstName: {}, hashcode: {}", name, name.hashCode(), firstName, firstName.hashCode());
	}
}
