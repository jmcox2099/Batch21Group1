package JavaProjectPart1;

public class CodingTask4 {
    public static void main(String[] args) {
        // Create a 2D array
        int [][] array2D={
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39}
        };

// Initialize sums for odd and even numbers
        int sumOdd = 0;
        int sumEven = 0;

// Iterate through the 2D array to calculate sums
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                int number = array2D[i][j];

                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }
        }

// Print the results
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);

        //comment test only.
    }
}
