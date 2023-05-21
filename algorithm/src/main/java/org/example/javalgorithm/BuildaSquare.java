package org.example.javalgorithm;

public class BuildaSquare {
    public static void main(String[] args) {
        int n = 4;
        String s = "+";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
