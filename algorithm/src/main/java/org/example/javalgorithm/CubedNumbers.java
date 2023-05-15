package org.example.javalgorithm;

public class CubedNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {-5, -5, 5, 5};

        for (int num : arr) {
            if (num % 2 != 0) {  // Check if the number is odd
                sum += Math.pow(num, 3);  // Cube the number and add it to the sum
            } else if (num % 2 == 0 && num != 0) {
                System.out.println();  // Return null if any value in the array is not a number
            }
        }

        System.out.println(sum);
    }
    }

