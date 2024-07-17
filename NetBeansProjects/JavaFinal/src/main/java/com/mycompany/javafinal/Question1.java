/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Write a Java program that reads data from a file named "data.txt". Implement error 
handling using try-catch blocks to handle FileNotFoundException. If the file is not 
found, print an error message indicating the issue.
*/

package com.mycompany.javafinal;

/**
 *
 * @author masum
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Reading data from file...");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please ensure that the file 'data.txt' exists in the current directory.");
        }
    }
}