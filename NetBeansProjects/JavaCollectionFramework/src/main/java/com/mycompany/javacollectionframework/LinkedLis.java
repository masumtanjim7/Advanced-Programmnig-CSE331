/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.LinkedList;

/**
 *
 * @author masum
 */
public class LinkedLis {
   public static void main(String[] args) {
      LinkedList<String>l1=new LinkedList<>();
      l1.add("A");
      l1.add("B");
      l1.addLast("C");
      l1.addFirst("D");
      l1.add(2,"E");
     
      System.out.println(l1);
      l1.remove("B");
      l1.remove(3);
      l1.removeFirst();
      l1.removeLast();
      
      System.out.println(l1);
    } 
}
