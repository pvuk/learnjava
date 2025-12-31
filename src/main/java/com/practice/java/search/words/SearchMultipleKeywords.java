package com.practice.java.search.words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 14-October-2025 21:25:09
 */
public class SearchMultipleKeywords {
	public static void main(String[] args) {
	       // Define search keywords
        List<String> searchWords = Arrays.asList("HPGSingle", "HPGBlock-Parent", "HPGBlock-Child");

        // Define input strings as key-value pairs
        List<String> inputStrings = Arrays.asList(
            "EBP_HPGSingleToEBPNonContractNonAuto_100_Send=101111",
            "EBP_HPGMessagesSingleToEBPContractcual_001_Connect=4",
            "EBP_HPGBlockToEBPNonContractNonAutoChild_100_Send=51119",
            "EBP_HPGBlockToEBPNonContractNonAutoConfirm_100_Send=51111",
            "EBP_HPGBlockToEBPNonContractNonAutoParent_100_Send=51119",
            "EBP_HPGBlockToEBPNonContractAutoConfirmParent_100_Send=219899"
        );

        // Convert input strings to a Map<String, Integer>
        Map<String, Integer> inputMap = inputStrings.stream()
            .map(s -> s.split("="))
            .filter(parts -> parts.length == 2)
            .collect(Collectors.toMap(
                parts -> parts[0],
                parts -> Integer.parseInt(parts[1])
            ));

        // Result map to store sum for each keyword
        Map<String, Integer> result = new HashMap<>();

        for (String keyword : searchWords) {
            // Split hyphenated keywords into parts
            String[] parts = keyword.split("-");

            // Sum values where all parts of the keyword are found in the key
            int sum = inputMap.entrySet().stream()
                .filter(entry -> Arrays.stream(parts).allMatch(part -> entry.getKey().contains(part)))
                .mapToInt(Map.Entry::getValue)
                .sum();

            result.put(keyword, sum);
        }

        // Print the result
        result.forEach((k, v) -> System.out.println(k + " => " + v));

	}
}
