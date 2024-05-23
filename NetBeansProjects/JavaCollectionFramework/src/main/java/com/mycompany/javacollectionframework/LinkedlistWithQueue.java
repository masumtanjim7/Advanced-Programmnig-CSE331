/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author masum
 */
public class LinkedlistWithQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        System.out.println("Elements of queue " + q);

        int re = q.remove();
        System.out.println("removed element " + re);

        System.out.println(q);
        int head = q.peek();
        System.out.println("head of queue " + head);

        int size = q.size();
        System.out.println("Size of queue " + size);
    }
}
