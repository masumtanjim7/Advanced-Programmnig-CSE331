/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaexceptions;

/**
 *
 * @author masum
 */
import java.util.*;
class CarException extends Exception
{
    int seat;
    CarException(int seat)
    {
        this.seat=seat;
    }

}

class Car
{
    int seat_number;
    Car(int seat_number) throws CarException
    {
        if(seat_number>4)
        {
            throw new CarException(seat_number);
        }
        else {
            this.seat_number = seat_number;
            System.out.println("Total seat_number: "+seat_number);
        }
    }

}


public class Main {
    public static void main(String[] args)
    {
        try
        {

            Car c1 = new Car(3);
        }
        catch(CarException e)
        {
            System.out.println("Car seat number cannot be more than 4");

        }
    }
}