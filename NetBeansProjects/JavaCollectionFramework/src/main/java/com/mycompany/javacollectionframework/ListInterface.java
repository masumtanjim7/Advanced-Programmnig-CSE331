/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author masum
 */
public class ListInterface {
  
       public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        System.out.println(l1.get(2));
        l1.set(0,5);
        System.out.println(l1);
    } 

    
}
