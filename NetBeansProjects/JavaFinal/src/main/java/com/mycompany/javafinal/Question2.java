/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
Write a Java program that initializes an array of integers and attempts to access 
an element at an index beyond the array's length. Implement try-catch blocks to 
handle the ArrayIndexOutOfBoundsException that may occur. If the exception 
occurs, print a message indicating the invalid index.
 */
package com.mycompany.javafinal;

/**
 *
 * @author masum
 */
import java.util.Scanner;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            try {
                int value = numbers[index];
                System.out.println("Value at index " + index + " is: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.err.println("Error: Attempted to access index " + index + " which is out of bounds.");
}
} finally {
scanner.close(); 
        }
    }
}
