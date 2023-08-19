package org.example.javalgorithm;

public class SumNumber {
    public static void main(String[] args) {
        int value = 6;
                if (value < 0)
                    System.out.println(value + "<0");

                if (value == 0)
                    System.out.println("0=0");

                int sum = 0;
                String result = "0";

                for (int i = 1; i <= value; i++) {
                    result += "+" + i; //문자열에 추가해준다
                    sum += i;
                }

                System.out.println(result + " = " + sum); //생성된 문자열을 이미 나온 결과와 붙여주기
            }
    }
