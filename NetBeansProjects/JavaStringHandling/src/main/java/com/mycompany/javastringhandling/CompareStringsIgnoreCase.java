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

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (compareIgnoreCase(str1, str2)) {
            System.out.println("The strings are equal, ignoring case.");
        } else {
            System.out.println("The strings are not equal, ignoring case.");
        }
    }

    public static boolean compareIgnoreCase(String str1, String str2) {
        // Convert both strings to lowercase using the toLowerCase() method
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        // Compare the lowercase strings using the equals() method
        return lowerStr1.equals(lowerStr2);
    }
}