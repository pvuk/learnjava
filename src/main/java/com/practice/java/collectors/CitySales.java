package com.practice.java.collectors;
/**
 * 
 * @author Venkata.Pulipati
 * @since Wednesday 13-May-2026 12:16:23
 * @return
 */
class CitySales {
    private String city;
    private double amount;

    public CitySales(String city, double amount) {
        this.city = city;
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return city + " -> " + amount;
    }
}
