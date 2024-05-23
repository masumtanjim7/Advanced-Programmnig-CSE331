/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.PriorityQueue;

/**
 *
 * @author masum
 */
public class ProrityQueueApply {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(10);

        pq.add(2);
        pq.add(10);
        pq.add(3);
        pq.add(15);
        pq.add(4);

        System.out.println("Priority queue: " + pq);

        System.out.println("Peek: " + pq.peek());

        pq.poll();

        System.out.println("Priority queue after removing top element: " + pq);

        System.out.println("Does the queue contain 3? " + pq.contains(3));

        System.out.println("Size of queue: " + pq.size());

        pq.clear();

        System.out.println("Is the queue empty? " + pq.isEmpty());
    }
}
