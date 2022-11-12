package my202210;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        final int num = 54321;
        String[] array = String.valueOf(num).split(""); //num의 자료형으로 배열을 받는다? parseint는 자료형이, valueof는 객체가 리턴타입이다.
        Arrays.sort(array, Collections.reverseOrder()); // Array.sort() 안에 들어있는 기능이다. collections.reverseOrder() -> 내림차순 정렬.
        System.out.println(Integer.parseInt(String.join("", array))); // String.join()의 기능이다. 앞에 나온 인자를 기준으로 문자열을 붙여준다.
//         return Integer.valueOf(String.join("", array));
    }
}
