/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.Stack;

/**
 *
 * @author masum
 */
public class StackApply {
     public static void main(String[] args) {
     Stack<Integer> stack = new Stack<Integer>();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     while(!stack.isEmpty())
     {
         System.out.println(stack.pop());
     }
    }
}
