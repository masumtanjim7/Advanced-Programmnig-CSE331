/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Callme target = new Callme();
 Caller ob1 = new Caller(target, "Hello");
 Caller ob2 = new Caller(target, "Synchronized");
 Caller ob3 = new Caller(target, "World");
 // wait for threads to end
 try {
 ob1.t.join();
 ob2.t.join();
 ob3.t.join();
 } catch(InterruptedException e) {
 System.out.println("Interrupted");
 }
 }

}
