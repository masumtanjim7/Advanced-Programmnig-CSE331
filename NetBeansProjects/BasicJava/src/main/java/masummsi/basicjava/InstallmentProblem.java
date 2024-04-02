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
public class InstallmentProblem {
    
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
        int numberofinstallment,installmentpermonth;
        int PhonePrice = 1800;
        
        
        System.out.print("Number of Installment? : ");
          numberofinstallment = number.nextInt();
          
          
          installmentpermonth = PhonePrice/numberofinstallment;
      System.out.println("Monthly Installment Amount : "+installmentpermonth);
       
    }
}
