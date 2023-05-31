package org.example.javalgorithm;

import java.util.Arrays;

public class MostDigits {

    public static void main(String[] args) {
        int[] numbers = {1, 9000, 30};


                int index = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[index])).length()) {
                        index = i;
                    }
                }
                System.out.println(numbers[index]);
            }


}
