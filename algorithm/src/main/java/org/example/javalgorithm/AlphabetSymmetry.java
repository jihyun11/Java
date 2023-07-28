package org.example.javalgorithm;

import java.util.ArrayList;
import java.util.List;

public class AlphabetSymmetry {
    public static void main(String[] args) {
        String[] words = {"abode", "ABc", "xyzD"};

        int a = -2;
        int b = 3;
        int d = -1;
        int cou = 0;

        if (a > 0) {
            cou++;
        } else if (b > 0) {
            cou++;
        } else if (d > 0) {
            cou++;
        } else if (1 <= cou) {
            System.out.println(true);
        }


        List<Integer> result = new ArrayList<>();

        for(int j = 0; j < words.length; j++) {
            int count = 0;
            for (int i = 0; i < words[j].length(); i++) {
                char c = Character.toUpperCase(words[j].charAt(i));
                if (c - 'A' + 1 == i + 1) { //알파벳이 변수 c로부터 얼마나 떨어져있는지 알려주는 연산
                    count++;
                }
            }
            result.add(count);
        }

        int[] array = result.stream().mapToInt(Integer::intValue).toArray(); //Integer 타입이었던 리스트를 int 타입으로 변환
        System.out.println(result);


    }
}
