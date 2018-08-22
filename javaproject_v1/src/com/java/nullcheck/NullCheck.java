package com.java.nullcheck;

import java.util.Optional;

import org.springframework.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NullCheck {
	public static void main(String[] args) {
//		System.out.println(ObjectUtils.identityToString(new BigDecimal(1.11)));
//		System.out.println(Integer.toHexString(System.identityHashCode(new BigDecimal(1.11))));
//		Long l = 0l;
//		if (l != null && l.longValue() != 0)
//		System.out.println(l);
		
		checkNullString("null");
		checkNullString("");
		checkNullString(null);
	}
	
	public static void checkNullString(String value){
		log.info("String input: {}, isNull: {}", value, (Optional.ofNullable(value).isPresent() || StringUtils.isEmpty(value)));
	}
}
