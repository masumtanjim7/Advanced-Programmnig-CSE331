/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabmid;

/**
 *
 * @author masum
 */
public class Football {
    private int radius;
    private int weight;

    public Football(int radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }

    public Football() {
        this(1, 2);
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Football ob1 = new Football(10, 20);
        Football ob2 = new Football();
        System.out.println("Values of ob1:");
        ob1.display();
        System.out.println("Values of ob2:");
        ob2.display();
    }
}