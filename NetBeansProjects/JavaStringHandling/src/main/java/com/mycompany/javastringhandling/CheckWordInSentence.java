/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastringhandling;

/**
 *
 * @author masum
 */
public class CheckWordInSentence {
    public static void main(String[] args) {
        String sentence = "This is orange juice";
        String word = "orange";

        if (checkWord(sentence, word)) {
            System.out.println("The word '" + word + "' is present in the sentence.");
        } else {
            System.out.println("The word '" + word + "' is not present in the sentence.");
        }
    }

    public static boolean checkWord(String sentence, String word) {
        // Convert both the sentence and the word to lowercase using the toLowerCase() method
        String lowerSentence = sentence.toLowerCase();
        String lowerWord = word.toLowerCase();

        // Check if the sentence contains the word using the contains() method
        return lowerSentence.contains(lowerWord);
    }
}