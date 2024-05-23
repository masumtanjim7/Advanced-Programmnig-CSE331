/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabmid;

/**
 *
 * @author masum
 */
public class Drive49 {
    private double totalCapacity;
    private double used;
    private double free;

    public Drive49() {
        this.totalCapacity = 10;
        this.used = 0;
        this.free = totalCapacity;
    }

    public Drive49(double totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.used = 0;
        this.free = totalCapacity;
    }

    public void uploadFile(double size) {
        if (size <= free) {
            used += size;
            free -= size;
            System.out.println("File uploaded successfully.");
        } else {
            System.out.println("Not enough free space to upload the file.");
        }
    }

    public void upgrade(double newTotalCapacity) {
        double newUsed = used;
        double newFree = newTotalCapacity - newUsed;
        totalCapacity = newTotalCapacity;
        used = newUsed;
        free = newFree;
        System.out.println("User plan upgraded successfully.");
    }

    public void viewStatus() {
        System.out.println("Total capacity: " + totalCapacity + " GB");
        System.out.println("Used: " + used + " GB");
        System.out.println("Free: " + free + " GB");
    }

    public static void main(String[] args) {
        Drive49 drive49 = new Drive49();
        drive49.viewStatus();
        System.out.println("Uploading a 1 GB file...");
        drive49.uploadFile(1);
        drive49.viewStatus();
        System.out.println("Upgrading user plan to 15 GB...");
        drive49.upgrade(15);
        drive49.viewStatus();
    }
}
