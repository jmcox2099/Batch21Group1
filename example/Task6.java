package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //6. Write a Java program to check whether a given number is prime or not.
        Scanner input = new Scanner(System.in);
        boolean isItPrime = true;
        System.out.println("Please enter a number to see if it's prime");
        int number = input.nextInt();
        if (number <= 1) {
            isItPrime = false;
        }
        for (int x = 2; x < number; x++) {
            if (number % x == 0) {
                isItPrime = false;
            }
        }
        if (isItPrime) {
            System.out.println(number+" is prime!");
        } else {
            System.out.println(number+" is not a prime number.");
        }
        input.close();
    }
}