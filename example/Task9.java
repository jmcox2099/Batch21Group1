package org.example;

public class Task9 {
    public static void main(String[] args) {
        //9. Write a program to print out duplicate elements from an Array of Strings.
        String [] names = {"Phillip","Carlie","Jose","Christine","Stephen",
                "Heather","Carl","Bart","Amy","Dawn","Jose","Phyllis","Samantha","Chucky","Dawn"};

        for(int x=0; x< names.length; x++){
            for(int z=x+1; z< names.length; z++) {
                if(names[x].equals(names[z])) {
                    System.out.println("Duplicate name found: "+names[x]);
                }
            }
        }
    }
}
