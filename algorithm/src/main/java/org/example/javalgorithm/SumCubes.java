package org.example.javalgorithm;

public class SumCubes {

    public static void main(String[] args) {
        long n = 3;
        long sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println(sum);
    }
}
