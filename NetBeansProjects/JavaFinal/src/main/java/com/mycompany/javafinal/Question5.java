/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Write a Java program to validate an email address entered by the user. 
Implement multiple catch blocks to handle different types of exceptions that may 
occur during validation, such as IllegalArgumentException for invalid format and 
NullPointerException for null input. Use a finally block to close any resources 
opened during validation.
*/
package com.mycompany.javafinal;

/**
 *
 * @author masum
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Question5 {
    private static final String EMAIL_PATTERN = 
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an email address: ");
            String email = scanner.nextLine();

            if (email == null) {
                throw new NullPointerException("Email address cannot be null");
            }

            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format");
            }

            System.out.println("Email address is valid");
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
