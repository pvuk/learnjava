package com.practice.java.collectors;
import java.util.*;
import java.util.stream.Collector;

class AvgAccumulator {
    double sum = 0;
    long count = 0;

    void add(double value) {
        sum += value;
        count++;
    }

    AvgAccumulator combine(AvgAccumulator other) {
        this.sum += other.sum;
        this.count += other.count;
        return this;
    }

    double getAverage() {
        return count == 0 ? 0 : sum / count;
    }
}
