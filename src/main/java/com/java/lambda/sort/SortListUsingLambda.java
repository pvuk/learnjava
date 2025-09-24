package com.java.lambda.sort;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.JsonCodeDocument;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortListUsingLambda {
	
	public static void main(String[] args) {
		String pathname = "/src/main/resources/json/put/put-card_status_code.json";
		try {
			File file = new File(System.getProperty("user.dir") + pathname);
			InputStream iStream = null;
			List<JsonCodeDocument> alJCD = new ArrayList<JsonCodeDocument>();
			if(file.exists()) {
//				JsonParser jsonParser = new JsonParser(new FileReader(file));
//				ArrayList<Object> arrayList = jsonParser.parseArray();
//				alJCD = new ObjectMapper().convertValue(arrayList, new TypeReference<List<JsonCodeDocument>>() {});
//				if(alJCD != null) {
//					log.info("Json Array Data: ");
//					System.out.println(alJCD);
//				}
			} else {
				log.error("File not found in path: {}", file);
			}
		} finally {
			
		}
	}
	
	public static List<JsonCodeDocument> usingComparator(List<JsonCodeDocument> list) {
		Comparator<JsonCodeDocument> ascSort = (JsonCodeDocument jcd1, JsonCodeDocument jcd2) -> {
			return jcd1.getCode().compareTo(jcd2.getCode());
		};
		Collections.sort(list, ascSort);
		return list;
	}

	public static List<JsonCodeDocument> usingStream_Sorted__By__Comparator_Comparing(List<JsonCodeDocument> list) {
		list = list.stream().sorted(Comparator.comparing(JsonCodeDocument::getCode)).collect(Collectors.toList());
		return list;
	}
}
