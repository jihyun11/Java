package org.example.codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.codingtest.coinChange.*;

public class Hanteo2 {
    public static void main(String[] args) {
        int sum = 4;
        int[] coins = {1, 2, 3};

        List<List<Integer>> combinations = findCoinChange(coins, sum);

        System.out.println("입력: 합계=" + sum + ", " + "coins[] = {" + Arrays.toString(coins) + "}" );
        System.out.println("출력: " + countCoinChange(coins, sum));
        System.out.println("설명: " + combinations.size() + "가지 솔루션이 있습니다." + combinations);


    }
}
