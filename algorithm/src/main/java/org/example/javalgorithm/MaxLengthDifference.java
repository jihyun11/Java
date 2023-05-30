package org.example.javalgorithm;

public class MaxLengthDifference {
    public static Integer maxLengthDifference (String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int maxDiff = 0;

        for (String x : a1) {
            for (String y : a2) {
                int diff = Math.abs(x.length() - y.length());
                maxDiff = Math.max(maxDiff, diff);
            }
        } return maxDiff;
    }

    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        Integer result = maxLengthDifference(a1, a2);
        System.out.println(result);
    }
}
