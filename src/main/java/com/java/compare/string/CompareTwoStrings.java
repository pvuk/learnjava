package com.java.compare.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompareTwoStrings {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		log.info("s1 value: {}, hashCode: {}", s1, s1.hashCode());
		log.info("s2 value: {}, hashCode: {}", s2, s2.hashCode());
		log.info("s3 value: {}, hashCode: {}", s3, s3.hashCode());
		
		log.info("s1 equals s2: {}", s1.equals(s2));
		log.info("s2 equals s3: {}", s2.equals(s3));
		
		log.info("s1 == s2: {}", s1 == s2);
		log.info("s2 == s3: {}", s1 == s3);
		
		s1 = s1.toUpperCase();
		log.info("changing s1: {} to uppercase: {}, hashCode: {}", s1, s1, s1.hashCode());
		log.info("s1 equals s2: {}", s1.equals(s2));
		
		String s4 = "ABC";
		log.info("s4 value: {}, hashCode: {}", s4, s4.hashCode());
		log.info("s1 equals s4: {}", s1.equals(s4));
	}
}
