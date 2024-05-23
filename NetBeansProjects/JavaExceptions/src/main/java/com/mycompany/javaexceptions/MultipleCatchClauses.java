/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
public class MultipleCatchClauses
{
    public static void main(String args[])
    {
        try{
            int a = 42/0;
            int c[]={1};
            c[4]=3;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("code After try/catch block");
        }
    }
}
