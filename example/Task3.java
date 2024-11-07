package org.example;

public class Task3 {
    public static void main(String[] args) {
        /*3. Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program that will identify/print the even numbers only.
         */
        int [][] distinguishableThings = {
                {1,4,12,54,35,17},
                {18,94,28,64,51},
                {3,9,11,4},
                {7,77,17,84,96}
        };
        System.out.println("These are all the even numbers:");
        for (int [] dT:distinguishableThings) {
            for (int tD:dT) {
                if (tD%2==0) {
                    System.out.print(tD+" ");
                }
            }
        }

    }
}
