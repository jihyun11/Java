package org.example.javalgorithm;

import java.util.Arrays;

public class Decimal {
    public static void main(String[] args) {
        long n = 12345;
        String s = String.valueOf(n);

        String[] ss = s.split("");

        int i = ss.length;

        System.out.println(i);

        //Sort the Gift Code 문제

        String code = "fedcba";
        char[] charArr = code.toCharArray();
        Arrays.sort(charArr);
        String sss = String.valueOf(charArr);

        System.out.println(sss);

        String abc = "abc";
        String reverse = "";
        for (int j = abc.length() -1; j >= 0; j-- ) {
            reverse = reverse + abc.charAt(j);

        }

        System.out.println(reverse);



    }
}
