package com.practice.java.search.words;
import java.util.*;
import java.util.stream.Collectors;

public class MatcherExample {
    public static void main(String[] args) {
        List<String> listOfDB = Arrays.asList(
            "Notification - PV Sequencer Single",
            "Notification - PV Sequencer Block"
        );

        List<String> matchList = Arrays.asList(
            "PV Seq single"
        );

        List<String> matchedItems = listOfDB.stream()
            .filter(dbItem -> matchList.stream().anyMatch(match -> isTokenMatch(dbItem, match)))
            .collect(Collectors.toList());

        matchedItems.forEach(System.out::println);
    }
    
    /**
     * PV Seq single match with Notification - PV Sequencer Single return true
     * PV Seq single match with Notification - PV Sequencer Not Single return false
     * 
     * @author Venkata.Pulipati
     * @since Thursday 16-October-2025 19:23:36
     * @param dbItem
     * @param match
     * @return
     */
    // Match if tokens from matchList are mostly present in dbItem
    private static boolean isTokenMatch(String dbItem, String match) {
        // Synonym map
        Map<String, String> synonymMap = new HashMap<>();
        synonymMap.put("seq", "sequencer");

        // Negation words that should block a match
        Set<String> negationWords = new HashSet<>(Arrays.asList("not", "no", "none"));

        // Normalize and tokenize DB item
        List<String> dbTokens = Arrays.asList(dbItem.toLowerCase().replaceAll("\\s+", " ").split(" "));
        List<String> matchTokens = Arrays.asList(match.toLowerCase().replaceAll("\\s+", " ").split(" "));

        // Apply synonym mapping to match tokens
        List<String> normalizedMatchTokens = matchTokens.stream()
            .map(token -> synonymMap.getOrDefault(token, token))
            .collect(Collectors.toList());

        // Apply synonym mapping to DB tokens
        List<String> normalizedDbTokens = dbTokens.stream()
            .map(token -> synonymMap.getOrDefault(token, token))
            .collect(Collectors.toList());

        // Check for negation in DB tokens
        boolean hasNegation = normalizedDbTokens.stream().anyMatch(negationWords::contains);
        if (hasNegation) return false;

        // Check if all match tokens are present in DB tokens
        return normalizedMatchTokens.stream().allMatch(normalizedDbTokens::contains);
    }
}