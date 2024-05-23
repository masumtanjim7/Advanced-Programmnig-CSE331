/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
   public class Thread2 {
 
    // Main Driver Method
    public static void main(String[] args) throws Exception
    {
 
        // Creating a thread
        MyThread thread = new MyThread();
 
        // Naming thread as "Java"
        thread.setName("Java");
 
        // Start the functioning of a thread
        thread.start();
 
        // Sleeping thread for specific amount of time
        Thread.sleep(500);
 
        // Thread Java suspended temporarily
        thread.suspend();
 
        // Display message
        System.out.println(
            "Thread going to sleep for 5 seconds");
 
        // Sleeping thread for specific amount of time
        Thread.sleep(5000);
 
        // Display message
        System.out.println("Thread Resumed");
 
        // Thread Java resumed
        thread.resume();
    }
} 

