/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
import java.io.*;


public class ThrowKeywords {
    
    public static void method() throws IOException
    {
      System.out.println("Exception caught");
    }

    public static void main(String[] args) {
        try 
        {
            method();
        }
        catch(IOException e)
        {
            System.out.println("Exception handled");
        }
      
    }
}
