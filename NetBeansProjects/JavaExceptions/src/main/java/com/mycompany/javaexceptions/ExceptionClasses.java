/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
class MyException extends Exception
{
    private int detail;
    MyException(int a)
    {
        detail = a;
    }
    public String toString()
    {
        return "MyException["+detail+"]";
    }
}
public class ExceptionClasses {

    /**
     * @param args the command line arguments
     */
    static void compute(int a) throws MyException
    {
        System.out.println("Called compute("+a+")");
        if(a>10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            compute(1);
            compute(20);
        }
        catch(MyException e)
        {
            System.out.println("Caught "+e);
        }
    }
    
}