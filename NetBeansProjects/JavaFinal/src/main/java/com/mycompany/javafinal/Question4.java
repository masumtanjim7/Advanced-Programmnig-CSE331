/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Imagine you have a bank account. You can deposit and withdraw money from 
your account. You should keep in mind that the total amount of money withdrawn 
from your account must not exceed the total balance present in your account. If 
such a scenario happens, you need to safely execute from the banking system. 
Implement the above case in Java with the proper utilization of user-defined 
exception mechanism.

*/
package com.mycompany.javafinal;

/**
 *
 * @author masum
 */
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in the account");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Question4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: Tk" + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. New balance: Tk" + account.getBalance());
                        break;
                    case 3:
                        System.out.println("Current balance: Tk" + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InsufficientBalanceException e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println("Exiting the banking system due to insufficient balance...");
                return;
            }
        }
    }
}
