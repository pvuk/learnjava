package com.java.interview.cognizent;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author udaykiran pulipati
 * 
 * Q 8. How do you convert Map<String, Object> to Map<Integer, Object> using streams
 *
 */
@Slf4j
public class ConvertMapStringToMapIntegerUsingStreams {
	public static void main(String[] args) {
		Map<String, Object> mapStr = new HashMap<String, Object>();
		mapStr.put("3", "Germany");
		mapStr.put("1", "Telugu");
		mapStr.put("2", "English");
		mapStr.put("4", "Hindi");
		log.info("Map Str Key: {}", mapStr);
		
		Map<Integer, Object> mapInt = mapStr.entrySet().stream().collect(Collectors.toMap(
				e -> Integer.valueOf(e.getKey()),
				e -> e.getValue())
				);
		log.info("Map Int Key: {}", mapInt);
	}
}
