package com.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMostFrequentChar {

    public static char findSecondMostFrequentChar(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charFreq = new HashMap<>();

        // Count frequencies of each character in the input string
        for (char c : input.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Find the maximum and second maximum frequencies
        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;

        for (int freq : charFreq.values()) {
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = freq;
            } else if (freq > secondMaxFreq && freq < maxFreq) {
                secondMaxFreq = freq;
            }
        }

        // Find the character corresponding to the second maximum frequency
        char secondMostFreqChar = '\u0000'; // Default value if no valid character is found

        for (Entry<Character, Integer> entry : charFreq.entrySet()) {
            if (entry.getValue() == secondMaxFreq) {
                secondMostFreqChar = entry.getKey();
                break;
            }
        }

        return secondMostFreqChar;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        char result = findSecondMostFrequentChar(input);

        if (result != '\u0000') {
            System.out.println("The second most frequent character is: " + result);
        } else {
            System.out.println("No second most frequent character found");
        }
    }
}
