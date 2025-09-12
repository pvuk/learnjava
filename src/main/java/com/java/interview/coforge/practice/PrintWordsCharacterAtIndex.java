package com.java.interview.coforge.practice;
import java.util.Arrays;

public class PrintWordsCharacterAtIndex {
    public static void main(String[] args) {
        String[] arr = {"Java", "Data Science", "Hadoop", "Big Data", "Git", "Typescript", "Angular", "HTML"};

        // Print words where the character at index 1 is 'a'
        Arrays.stream(arr)
              .filter(word -> word.length() > 1 && word.toLowerCase().charAt(1) == 'a')
              .forEach(System.out::println);
    }
}
