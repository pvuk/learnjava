package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnknownKeyAccessInHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ABC");
		map.put(2, "DEF");
		log.info("{}", map.get(4));
	}
}
