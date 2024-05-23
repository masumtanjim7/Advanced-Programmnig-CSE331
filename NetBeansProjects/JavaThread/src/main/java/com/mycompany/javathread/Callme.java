/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javathread;

/**
 *
 * @author masum
 */
public class Callme {
 void call(String msg) {
 System.out.print("[" + msg);
 try {
 Thread.sleep(1000);
 } catch(InterruptedException e) {
 System.out.println("Interrupted");
 }
 System.out.println("]");
 }
}
class Caller implements Runnable {
 String msg;
 Callme target;
 Thread t;
 public Caller(Callme targ, String s) {
 target = targ;
 msg = s;
 t = new Thread(this);
 t.start();
 }
 public void run() {
    synchronized(target){
     target.call(msg);}
 }
}