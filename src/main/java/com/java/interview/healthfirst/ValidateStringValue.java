package com.java.interview.healthfirst;

/**
 * <p>
 * String value = "PULIPATI"; 
 * Display value contains more than 2 capitalized letters -> Warning: Verify that the field Local Family Name is correctly
 * capitalized because it contains more than 2 capital letters.
 * Example: 1. Udaykiran Pulipati ./
 * 			2. FirstName Lastname X
 * </p>
 * </br>
 * <p>
 * 👉 Rule Understanding:

	. Each word should start with 1 capital letter
	. Remaining letters should be lowercase
	. Multiple words allowed (space-separated)
	. Avoid ALL CAPS like PULIPATI
 * </p>
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Wed 15-Apr-2020 12:11
 *
 */
public class ValidateStringValue {

public static void main(String[] args) {
        String[] testValues = {
            "PULIPATI",
            "Udaykiran Pulipati",
            "Venkata UdayKiran Pulipati",
            "udaykiran pulipati",
            "UdayKiran Pulipati"
        };


        for (String value : testValues) {
            validate(value);
            System.out.println();
        }

    }
	
    /**
     * 
     * @author Venkata.Pulipati
     * @since Sunday 10-May-2026 19:32:12
     * @param value
     */
    public static void validate(String value) {
        long upperCount = value.chars()
                               .filter(Character::isUpperCase)
                               .count();
        /*
         * ✅ Regex Breakdown (Important for Interview 🔥)</br>
			^                     → start of string</br>
			([A-Z][a-z]*)         → first word: 1 Capital + lowercase</br>
			(\s[A-Z][a-z]*)*      → additional words (same pattern)</br>
			$                     → end of string</br>
         */
        String pattern = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";// Pattern: Each word must start with uppercase followed by lowercase letters
        boolean validFormat = value.matches(pattern);

        System.out.println("Input: " + value);

        if (upperCount > 2 && !validFormat) {
            System.out.println("Warning: Too many capital letters and incorrect capitalization format.");
        } 
        else if (upperCount > 2) {
            System.out.println("Warning: Verify that the field Local Family Name is correctly capitalized because it contains more than 2 capital letters.");
        } 
        else if (!validFormat) {
            System.out.println("Warning: Name should start with capital letters followed by lowercase letters.");
        } 
        else {
            System.out.println("✅ Valid Name");
        }
    }

}
