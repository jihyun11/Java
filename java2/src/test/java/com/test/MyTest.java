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

        int searchValue = 50;

        // searchValue가 몇번째에 위치해있는지 확인하는 함수
        int index = Solution.findIndex(arrayList, searchValue);

        Assertions.assertEquals(index, 49);
    }

    public static class Solution { //순차탐색
        public static int findIndex(List<Integer> arrayList, int searchValue) {
            for(int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i) == searchValue) {
                    return i;
                }
            }
            return -1;
        }
    }
}

