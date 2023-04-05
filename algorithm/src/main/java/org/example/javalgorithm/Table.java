package org.example.javalgorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Table {
    public static void main(String[] args) {
        int n = 3;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = (i + 1) * (j + 1);
            }


        }
        System.out.println(array);
    }
}
