/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masummsi.basicjava;

import java.util.Scanner;

/**
 *
 * @author masum
 */
public class ArthimeticOperator {
    
   public static void main(String[] args){
    
       Scanner num = new Scanner (System.in);
       
       int num1 , num2 , result; 
       
       System.out.print("Enter Value of Number1 : ");
              num1 = num.nextInt();
              
       System.out.print("Enter Value of Number2 : ");
              num2 = num.nextInt();
       
              
      
             result = num1 + num2;
       System.out.println("Addition Result : "+result);
       
             result = num1 - num2;
       System.out.println("Subtraction Result : "+result);
       
             result = num1*num2;
       System.out.println("Multiplication Result : "+result);
       
             double result2 = (double) num1 / num2;
       System.out.printf("Division Result : %f\n",result2);
       
}
  
}
