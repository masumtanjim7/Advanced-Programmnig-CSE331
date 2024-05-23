/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
public class ExampleClass implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
        Thread t = new Thread (ec);
        t.start();
    }
}