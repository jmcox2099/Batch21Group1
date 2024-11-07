package org.example;

public class Task4 {
    public static void main(String[] args) {
        /*4. Create a 2D array of integers.
        Develop a program that will calculate the sum of even and odd numbers separately for that array.
         */
        int [][] itDontMatta={
                {14,13,15,18,21},
                {28,63,95,48,12},
                {74,22,478,63},
                {369,71,13}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int[] x:itDontMatta) {
            for (int z:x) {
                if (z%2==0) {
                    sumEven+=z;
                } else if (z%2==1) {
                    sumOdd+=z;
                }
            }
        }
        System.out.println("The sum of the even numbers is "+sumEven+".");
        System.out.println("The sum of the odd numbers is "+sumOdd+".");

    }
}
