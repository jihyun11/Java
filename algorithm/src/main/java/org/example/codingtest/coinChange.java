package org.example.codingtest;

import java.util.ArrayList;
import java.util.List;

public class coinChange {
    public static int countCoinChange(int[] coins, int sum) {
        int[] count = new int[sum + 1]; //합계의 경우의 수를 세는 배열 생성
        count[0] = 1; //0원이 들어올 경우 사용
        ArrayList<Integer> list = new ArrayList<>();

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                count[i] += count[i - coin];

            }
        }

        return count[sum];
    } //입력과 출력을 담당하는 메소드

    public static List<List<Integer>> findCoinChange(int[] coins, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(coins, sum, 0, current, result);
        return result;
    } //백트래킹을 준비하는 메소드

    private static void backtrack(int[] coins, int remain, int start, List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (remain < 0 || start == coins.length) {
            return;
        }

        for (int i = start; i < coins.length; i++) {
            current.add(coins[i]);
            backtrack(coins, remain - coins[i], i, current, result);
            current.remove(current.size() - 1);
        }
    } //설명을 담당하는 메소드

    }
    //동적 프로그래밍과 백트래킹 사용
