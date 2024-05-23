/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastringhandling;

/**
 *
 * @author masum
 */
public class EvenLengthWords {
    public static void main(String[] args) {
        String str = "This is a sample string with some even-length words";
        System.out.println("Even-length words in the given string:");
        printEvenLengthWords(str);
    }

    public static void printEvenLengthWords(String str) {
        // Split the string into an array of words
        String[] words = str.split("\\s");

        // Iterate through the array of words
        for (String word : words) {
            // Check if the length of the word is even
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}