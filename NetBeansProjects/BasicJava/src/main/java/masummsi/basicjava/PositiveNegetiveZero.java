package masummsi.basicjava;

import java.util.Scanner;
public class PositiveNegetiveZero {

    public static void main(String[] args) {
        System.out.print("Please Insert Integer Value :  ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if (num >= 0) {
            System.out.println("Its an Positive Integer");
        } else {
            System.out.println("Its an Negetive Integer");
        }
        if (num == 0) {
            System.out.println("Zero Integer");

        }

    }

}









