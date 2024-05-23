/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author masum
 */
public class VectorApply {
     public static void main(String[] args) {
     List<Integer> l = new Vector<Integer>();
     l.add(12);
     l.add(23);
     l.add(22);
     l.add(20);
     l.add(10);
     System.out.println("Vector: "+l);
     System.out.println("The object that is replaced is: "+l.set(0, 21));
     System.out.println("The object that is replaced is: "+l.set(4, 50));
     System.out.println("The new Vector is: "+l);
    }
}
