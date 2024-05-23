/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastringhandling;

/**
 *
 * @author masum
 */
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + findLongestSubstring(input));
    }

    public static int findLongestSubstring(String input) {
        // Initialize a HashMap to store the characters and their indices
        HashMap<Character, Integer> charMap = new HashMap<>();

        // Initialize variables to keep track of the current substring and its length
        int start = 0;
        int end = 0;
        int maxLength = 0;

        // Iterate through the input string
        while (end < input.length()) {
            // Get the character at the current index
            char currentChar = input.charAt(end);

            // Check if the character is already in the HashMap
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                // If the character is already in the HashMap, update the start index to the next index of the repeated character
                start = charMap.get(currentChar) + 1;
            } else {
                // If the character is not in the HashMap, add it to the HashMap and update the length of the current substring
                charMap.put(currentChar, end);
                maxLength = Math.max(maxLength, end - start + 1);
            }

            // Move to the next index
            end++;
        }

        // Return the length of the longest substring without repeating characters
        return maxLength;
    }
}