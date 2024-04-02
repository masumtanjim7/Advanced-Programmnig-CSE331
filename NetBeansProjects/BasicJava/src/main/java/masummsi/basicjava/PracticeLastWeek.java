
package masummsi.basicjava;

import java.util.Scanner;

public class PracticeLastWeek {
   
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        
        
        float x , y ;
             
        
        System.out.print("Enter Value of X :  ");
               x = num1.nextInt();
        System.out.print("Enter Value of Y :  ");
               y = num1.nextInt();
               
               float result = x+y;
               float res2 = x-y;
               float res3 = x/y;
               float res4 = x%y;
               float res5 = x*y;
               float res6 = x*y+y+y-x*y+6+45-99*4+7+y+x-y/5/2/2+45*x+res2*result;
               
               
               
               
               
               
       System.out.printf("Addition Result : %.0f\n",result);
       
       System.out.printf("Subtraction Result : %.0f\n",res2);
       
       System.out.printf("Division Result : %.2f\n",res3);
       
       System.out.printf("Modulus Result : %.2f\n",res4);
       
       System.out.printf("Multiplication Result : %.2f\n",res5);
       
       System.out.printf("Equation  Result : %.3f\n",res6);
       
        
    }
}
