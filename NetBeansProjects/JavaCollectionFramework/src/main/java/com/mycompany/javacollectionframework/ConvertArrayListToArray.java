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
public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Contents of a1: "+a1);
        
        //get the array
        Integer ia[]=new Integer[a1.size()];
        ia=a1.toArray(ia);
        int sum = 0;
        for(int i: ia)
        {
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
       
    }
}
