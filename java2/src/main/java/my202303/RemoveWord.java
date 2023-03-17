package my202303;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveWord {
    public static void main(String[] args) {
        String s = "my cat is my cat fat";

        String[] a = s.split(" ");

        Stream<String> b = Arrays.stream(a).distinct();
        String c = b.collect(Collectors.joining(","));
//        문자열들 중 중복된 문자열은 제거한 뒤 합치기
        c = c.replaceAll(",", " ");
        System.out.println(c);

    }
}
