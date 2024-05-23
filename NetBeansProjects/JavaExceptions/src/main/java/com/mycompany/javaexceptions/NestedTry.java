/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
public class NestedTry { 
  
    public static void main(String args[]) 
    { 
        // Main try block 
        try { 
  
            // initializing array 
            int a[] = { 1, 2, 3, 4, 5 }; 
  
            // trying to print element at index 5 
             System.out.println(a[5]); 
  
            // try-block2 inside another try block 
            try { 
                //int a[]={1,2,3,4,5};
                // performing division by zero 
                int x = a[2] / 0; 
            } 
            catch (ArithmeticException e2) { 
                System.out.println("division by zero is not possible"); 
            } 
        } 
        catch (ArrayIndexOutOfBoundsException e1) { 
            System.out.println("ArrayIndexOutOfBoundsException"); 
            System.out.println("Element at such index does not exists"); 
        } 
    } 
    
} 