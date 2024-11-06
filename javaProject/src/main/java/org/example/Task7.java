package org.example;

public class Task7 {
    public static void main(String[] args) {
        //7. Write a Java Program to print the first 10 numbers of the Fibonacci series.
        int a = 0;
        int b = 1;
        System.out.println("The first 10 numbers in the Fibonacci sequence are:");
        System.out.print(a + " " + b);
        for (int x = 1; x < 9; x++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println("...and we can keep going!");
    }
}
