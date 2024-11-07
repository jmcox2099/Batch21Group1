package org.example;

public class Task8 {
    public static void main(String[] args) {
        //8. Write a Java program to find the second largest number in the array.
        int [] numbers={28,14,25,-69,578,245,698,321,145,784,634,2,-124,35,64,85,457,269,58,475};
        int maximumNumber=numbers[0];
        int penultimateNumber=numbers[1];
        int scrapNumber=numbers[2];

        for (int z=0; z<numbers.length; z++) {
            for (int x=z+1; x<numbers.length; x++) {
                if (numbers[z]>numbers[x]) {
                    maximumNumber = numbers[z];
                }

                }
            }
        }
    }

