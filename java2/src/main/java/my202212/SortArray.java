package my202212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // String 리스트 만들기
        int[] nums = {-4, -2, 0, 2, 5};

        for (int i = 0; i < nums.length; i++) { // 리스트에 더해지지 않고 쌓이는 것을 위해 기존 배열 원소들을 제곱해 준 뒤 문자열로 형변환 뒤 리스트에 쌓음
            list.add( Integer.toString(nums[i] * nums[i]));
        }
        ArrayList<Integer> list1 = new ArrayList<>(); // Integer 리스트 만들기
        for (String s : list) { // 오름차순 정렬을 위해 String 리스트를 위해 Integer 리스트에 넣음 (형변환)
            list1.add(Integer.parseInt(s));
        }
        Collections.sort(list1);
        System.out.println(list1.stream().mapToInt(i->i).toArray()); // 답안 형식에 맞게 다시 Integer 리스트를 int 배열로 형변환
    }
}
