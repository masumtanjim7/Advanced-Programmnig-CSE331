/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
public class Test extends Thread 
 {
     public void run()
     {
         System.out.println("Print something");
     }
     public static void main(String args[])
     {
         Test t = new Test();
         t.start();
     }
 }
