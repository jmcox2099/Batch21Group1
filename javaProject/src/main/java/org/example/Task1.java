package org.example;

public class Task1 {
    public static void main(String[] args) {
        /*1. Create a program that uses an array to store a list of temperatures for a week,
         and then uses a loop to find the highest and lowest temperature for the week.
         */
        int[] temperatures = {75, 82, 58, 68, 72, 64, 84};

        int max = temperatures[0];
        int min = temperatures[0];

        for (int x : temperatures) {
            if (temperatures[x]>max) {
                max = temperatures[x];
            }
            if (temperatures[x] < min) ;
            {
                min = temperatures[x];
            }
        }
        System.out.println("The highest temperature this week was " + max + ".");
        System.out.println("The lowest temperature this week was " + min + ".");
    }
}



