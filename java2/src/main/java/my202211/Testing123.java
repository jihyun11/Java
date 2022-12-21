package my202211;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing123 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        for (int i = 0; i < list.size(); i++) {
            String sen = String.format("%d: " + list.get(i), i+1);
            list.set(i, sen);


        }
        System.out.println(list);


    }
}
