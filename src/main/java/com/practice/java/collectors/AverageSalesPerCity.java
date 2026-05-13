package com.practice.java.collectors;
import java.util.*;
import java.util.stream.*;
/**
 * Parallel streams improve performance for large datasets by leveraging multi-core processing.</br>
 * 
 * @author Venkata.Pulipati
 * @since Wednesday 13-May-2026 12:16:56
 */
public class AverageSalesPerCity {
    public static void main(String[] args) {

        List<CitySales> transactions = List.of(

            // Hyderabad (10)
            new CitySales("Hyderabad", 120),
            new CitySales("Hyderabad", 80),
            new CitySales("Hyderabad", 200),
            new CitySales("Hyderabad", 150),
            new CitySales("Hyderabad", 90),
            new CitySales("Hyderabad", 300),
            new CitySales("Hyderabad", 110),
            new CitySales("Hyderabad", 95),
            new CitySales("Hyderabad", 250),
            new CitySales("Hyderabad", 400),

            // Bangalore (8)
            new CitySales("Bangalore", 220),
            new CitySales("Bangalore", 75),
            new CitySales("Bangalore", 130),
            new CitySales("Bangalore", 180),
            new CitySales("Bangalore", 60),
            new CitySales("Bangalore", 210),
            new CitySales("Bangalore", 140),
            new CitySales("Bangalore", 170),

            // Chennai (7)
            new CitySales("Chennai", 90),
            new CitySales("Chennai", 110),
            new CitySales("Chennai", 160),
            new CitySales("Chennai", 200),
            new CitySales("Chennai", 50),
            new CitySales("Chennai", 300),
            new CitySales("Chennai", 120),

            // Mumbai (12)
            new CitySales("Mumbai", 500),
            new CitySales("Mumbai", 450),
            new CitySales("Mumbai", 300),
            new CitySales("Mumbai", 200),
            new CitySales("Mumbai", 150),
            new CitySales("Mumbai", 600),
            new CitySales("Mumbai", 100),
            new CitySales("Mumbai", 250),
            new CitySales("Mumbai", 350),
            new CitySales("Mumbai", 400),
            new CitySales("Mumbai", 50),
            new CitySales("Mumbai", 700),

            // Delhi (6)
            new CitySales("Delhi", 110),
            new CitySales("Delhi", 130),
            new CitySales("Delhi", 90),
            new CitySales("Delhi", 200),
            new CitySales("Delhi", 300),
            new CitySales("Delhi", 80),

            // Pune (5)
            new CitySales("Pune", 140),
            new CitySales("Pune", 70),
            new CitySales("Pune", 200),
            new CitySales("Pune", 220),
            new CitySales("Pune", 95),

            // Kolkata (9)
            new CitySales("Kolkata", 100),
            new CitySales("Kolkata", 150),
            new CitySales("Kolkata", 180),
            new CitySales("Kolkata", 75),
            new CitySales("Kolkata", 220),
            new CitySales("Kolkata", 300),
            new CitySales("Kolkata", 60),
            new CitySales("Kolkata", 140),
            new CitySales("Kolkata", 160),

            // Ahmedabad (6)
            new CitySales("Ahmedabad", 130),
            new CitySales("Ahmedabad", 80),
            new CitySales("Ahmedabad", 170),
            new CitySales("Ahmedabad", 210),
            new CitySales("Ahmedabad", 95),
            new CitySales("Ahmedabad", 300),

            // Jaipur (5)
            new CitySales("Jaipur", 60),
            new CitySales("Jaipur", 120),
            new CitySales("Jaipur", 140),
            new CitySales("Jaipur", 200),
            new CitySales("Jaipur", 180),

            // Lucknow (7)
            new CitySales("Lucknow", 90),
            new CitySales("Lucknow", 110),
            new CitySales("Lucknow", 150),
            new CitySales("Lucknow", 175),
            new CitySales("Lucknow", 80),
            new CitySales("Lucknow", 210),
            new CitySales("Lucknow", 250)
        );

        calculateAverage(transactions);
}

	private static void calculateAverage(List<CitySales> transactions) {
		// ✅ Your logic
        Map<String, Double> avgSalesByCity =
            transactions.parallelStream()//Uses parallelStream() for performance
                .filter(t -> t.getAmount() > 100)
                .collect(Collectors.groupingBy(
                    CitySales::getCity,
                    Collectors.averagingDouble(CitySales::getAmount)//compute the average using averagingDouble
                ));

        // ✅ Print output
        avgSalesByCity.forEach((city, avg) ->
            System.out.println(city + " -> Avg Sales: " + avg));
    }
}