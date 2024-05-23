/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
public class ThrowClass 
{
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible");
        }
        else
        {
            System.out.println("Eligible");
        }
    }
    public static void main(String args[])
    {
        validate(13);
    }
}
