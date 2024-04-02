
package masummsi.basicjava;

import java.util.Scanner;   // Scanner class location define 
        
public class InputFromUser {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        int num1;
        String name,mobno;
        double salary;
        
        System.out.print("Enter Your Age : ");
               num1 = input.nextInt();
         
         System.out.print("Enter Your Name : ");
                name = input1.nextLine();
              
         System.out.print("Enter Your Phone No : ");
                mobno = input2.next();
                
         System.out.print("Enter Your Slary : ");
                salary = input3.nextDouble();
        
        System.out.println("\n\n Users Details Information.....");
        System.out.println("Your Name : "+name);
        System.out.println("Your Age : "+num1);
        System.out.println("Your Contact No : "+mobno);
        System.out.printf("Your Monthly Salary : %.3f",salary);
    }
}
