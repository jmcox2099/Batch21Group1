package org.example;

public class Task2 {
    public static void main(String[] args) {
        /*2. Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */
        int[] factors={28,13,42,67,19,857,63,457,235,487,64,22,1,17,65};
        int sum=0;
        for (int x:factors) {
            sum+=x;
        }
        System.out.println("The total sum is "+sum);
    }
}
