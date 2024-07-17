/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Write a Java program to simulate bank account transactions. Implement trycatch blocks to handle exceptions that may occur during withdrawal or deposit 
operations, such as InsufficientFundsException for insufficient balance and 
NegativeAmountException for negative amounts. Use a finally block to ensure that 
resources are properly released after each transaction
*/
package com.mycompany.javafinal;

/**
 *
 * @author masum
 */
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot deposit a negative amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot withdraw a negative amount");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Question3 {
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
            } catch (InsufficientFundsException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (NegativeAmountException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
}
