package org.example.javalgorithm;

public class SumSequence {
    public static void main(String[] args) {
        int start = 2;
        int end = 6;
        int step = 2; // 2 + 4 + 6
        int result = 0;

        for (int i = start; i < end + 1; i += step) {
            result += i;
        }
        System.out.println(result);
    }
}
