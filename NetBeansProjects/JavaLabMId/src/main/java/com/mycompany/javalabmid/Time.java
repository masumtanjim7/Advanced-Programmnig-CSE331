/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalabmid;

/**
 *
 * @author masum
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(Time other) {
        this(other.hours, other.minutes, other.seconds);
    }

    public Time add_time(Time other) {
        int secondsSum = this.seconds + other.seconds;
        int minutesSum = this.minutes + other.minutes + secondsSum / 60;
        int hoursSum = this.hours + other.hours + minutesSum / 60;
        minutesSum %= 60;
        secondsSum %= 60;
        return new Time(hoursSum, minutesSum, secondsSum);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 55, 40);
        Time t2 = new Time(5, 20, 30);
        Time t3 = t1.add_time(t2);
        t3.display();  // prints 8:16:10
    }
}