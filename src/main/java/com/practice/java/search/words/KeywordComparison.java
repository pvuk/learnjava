package com.practice.java.search.words;
import java.util.*;
import java.util.stream.*;

class QueryResults {
    String txnName;
    int dbCount;
    int lrCount;
    int volume;

    public QueryResults(String txnName, int dbCount, int lrCount, int volume) {
        this.txnName = txnName;
        this.dbCount = dbCount;
        this.lrCount = lrCount;
        this.volume = volume;
    }

    public String getTxnName() { return txnName; }
    public int getDbCount() { return dbCount; }
    public int getLrCount() { return lrCount; }
    public int getVolume() { return volume; }
}

class ResponseJson {
    String txnName;
    int volume;
    int dbCount;
    int lrCount;
    int diviation;
    String status;

    public ResponseJson(String txnName, int volume, int dbCount, int lrCount, int diviation, String status) {
        this.txnName = txnName;
        this.volume = volume;
        this.dbCount = dbCount;
        this.lrCount = lrCount;
        this.diviation = diviation;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
            "{txnName='%s', volume=%d, dbCount=%d, lrCount=%d, diviation=%d, status='%s'}",
            txnName, volume, dbCount, lrCount, diviation, status
        );
    }
}

/**
 * 
 * @author Venkata.Pulipati
 * @since Tuesday 14-October-2025 22:42:32
 */
public class KeywordComparison {
    public static void main(String[] args) {
        // Input key-value pairs
        List<String> inputStrings = Arrays.asList(
            "EBP_HPGBlockToEBPNonContractNonAutoParent_100_Send=51119",
            "EBP_HPGBlockToEBPNonContractAutoConfirmParent_100_Send=219899"
        );

        // Search keywords
        List<String> searchKeywords = Arrays.asList("HPGBlock-Parent");

        // Convert input strings to a Map<String, Integer>
        Map<String, Integer> inputMap = inputStrings.stream()
            .map(s -> s.split("="))
            .filter(parts -> parts.length == 2)
            .collect(Collectors.toMap(
                parts -> parts[0],
                parts -> Integer.parseInt(parts[1])
            ));

        // Calculate result map: keyword -> sum of matched values
        Map<String, Integer> resultMap = new HashMap<>();
        for (String keyword : searchKeywords) {
            String[] keywordParts = keyword.split("-");
            int sum = inputMap.entrySet().stream()
                .filter(entry -> Arrays.stream(keywordParts).allMatch(part -> entry.getKey().contains(part)))
                .mapToInt(Map.Entry::getValue)
                .sum();
            resultMap.put(keyword, sum);
        }

        // Sample DB results to compare
        List<QueryResults> listOfDB = Arrays.asList(
            new QueryResults("HPGBlock-Parent", 271018, 271018, 300000),
            new QueryResults("HPGBlock-Parent", 100000, 95000, 300000)
        );

        // Generate ResponseJson list
        List<ResponseJson> responseList = listOfDB.stream()
            .map(db -> {
                int expected = resultMap.getOrDefault(db.getTxnName(), 0);
                String status = (db.getDbCount() == expected) ? "Pass" : "Fail";
                int diviation = db.getDbCount() - db.getLrCount();
                return new ResponseJson(db.getTxnName(), db.getVolume(), db.getDbCount(), db.getLrCount(), diviation, status);
            })
            .collect(Collectors.toList());

        // Print response
        responseList.forEach(System.out::println);
    }
}