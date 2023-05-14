package org.example.javalgorithm;

public class recursion {
    int i = 0;
    public static void main(String[] args) {
        int n = 25;

        recursion recursion = new recursion();
        System.out.println(recursion.number(25));

    }

    public static int number(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + number(n / 2);
        }
    }
}
