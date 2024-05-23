/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
class CurrentThreadDemo
 {
     public static void main(String args[])
     {
         Thread t = Thread.currentThread();
         System.out.println("Current Thread: "+t.getName());
         t.setName("My thread");
         System.out.println("After name change: "+t);
     }
 }