/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastringhandling;

/**
 *
 * @author masum
 */
import java.util.Scanner;

public class CompareStringsLexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (compareLexicographically(str1, str2)) {
            System.out.println("The strings are lexicographically equal.");
        } else {
            System.out.println("The strings are not lexicographically equal.");
        }
    }

    public static boolean compareLexicographically(String str1, String str2) {
        // Check if the strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare the strings character by character using the charAt() method
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // If the loop completes without returning false, the strings are lexicographically equal
        return true;
    }
}