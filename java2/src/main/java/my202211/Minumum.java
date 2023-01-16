package my202211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Minumum {
    public static void main(String[] args) {
        int[] values = {1, 3, 1};
        String[] nvalues = new String[values.length];
        for (int i = 0; i < nvalues.length; i++) {
            nvalues[i] = String.valueOf(values[i]);
        }
        List<String> list = Arrays.asList(nvalues);
        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(newList);

        System.out.println(newList);
    }
}
