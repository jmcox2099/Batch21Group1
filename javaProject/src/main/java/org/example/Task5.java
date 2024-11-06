package org.example;

public class Task5 {
    public static void main(String[] args) {
        //5. Write a program to swap 2 numbers without a temporary variable.
        int x=3;
        int j=28;

        System.out.println("Variable X is "+x+" and variable J is "+j+".");

        x=x+j;
        j=x-j;
        x=x-j;

        System.out.println("Now variable X is "+x+" and variable J is "+j+"." );
    }
}
