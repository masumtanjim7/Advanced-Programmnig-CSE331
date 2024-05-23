/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.ArrayList;

/**
 *
 * @author masum
 */
public class ArrayListApply {
   public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        System.out.println("Initial Size of a1: "+a1.size());
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("Size of a1 after additions: "+a1.size());
        System.out.println("Contents of a1: "+a1);
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size of a1 after deletions: "+a1.size());
        System.out.println("Contents of a1: "+a1);
    } 
}
