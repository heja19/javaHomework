//Exercise 1
package com.company;

import java.util.Scanner;

public class Exercise1 {

    static double squareperimeter(double radius) {
        return (radius * 2) * 4;//squareperimeter formula
    }

    static double squarearea(double radius) {
        return (radius * 2) * (radius * 2);//squarearea formula
    }

    static double circleperimeter(double radius) {
        return (2 * radius) * Math.PI;//circleperimeter formula
    }

    static double circlearea(double radius) {
        return (radius * radius) * Math.PI;//circlearea formula
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Insert radius of circle:"); //asking from user to insert radius of circle
        double r = input.nextDouble( );
        //double r = 3;
        double sp = squareperimeter(r);
        double sa = squarearea(r);
        double cp = circleperimeter(r);
        double ca = circlearea(r);
        //printing results
        System.out.println("Square perimeter is " + sp);
        System.out.println("Square area is " + sa);
        System.out.println("Circle perimeter is " + cp);
        System.out.println("Circle area is " + ca);

    }
}