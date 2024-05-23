/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.Vector;

/**
 *
 * @author masum
 */
public class VectorEachLoop {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        for(int i =1;i<=10;i++)
        {
            v1.add(i*10);
        }
        System.out.println("The Vector V is: "+v1);
        for(Integer x : v1)
        {
            System.out.println(x);
        }
        }
}

