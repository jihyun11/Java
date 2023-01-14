package com.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    void test() {
        // given
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            arrayList.add(i);
        }

        int searchValue = 35;

        // searchValue가 몇번째에 위치해있는지 확인하는 함수
        int index = Solution.findIndex(arrayList, searchValue);

        Assertions.assertEquals(index, 35);
    }

    public static class Solution { //순차탐색
        public static int findIndex(List<Integer> arrayList, int searchValue) {
            int left = 0;
            int right = arrayList.size() - 1;
            int mid;

            while (left <= right) {
                mid = (left + right) / 2;
                if(arrayList.get(mid) < searchValue) {
                    left = mid + 1;
                }
                else if (arrayList.get(mid) > searchValue) {
                    right = mid;
                }
                else return arrayList.get(mid);
            }
            return -1;
        }
    }
}

