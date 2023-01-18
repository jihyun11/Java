package my202211;

import java.util.ArrayList;
import java.util.List;

public class SmileFace {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(":)");
        list.add("XD");

        int a = 0;
        a = (int) list.stream().filter(i -> i.matches("[:;][-~]?[)D]")).count();
        System.out.println(a);

    }
}
