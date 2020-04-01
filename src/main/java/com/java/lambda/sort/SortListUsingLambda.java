package com.java.lambda.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.model.JsonCodeDocument;

public class SortListUsingLambda {
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
