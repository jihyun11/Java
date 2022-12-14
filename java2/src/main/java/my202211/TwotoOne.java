package my202211;

import java.util.Arrays;
import java.util.HashSet;

public class TwotoOne {
    public static void main(String[] args) {
        String s1 = "qwefssaf";
        String s2 = "sdfqwrgfsb";
        String s3 = s1 + s2;
        String[] array = s3.split("");

        HashSet<String> hashSet = new HashSet<>();
        for (String item : array
             ) {hashSet.add(item);

        }
        System.out.println(hashSet);
        String result = String.join("", hashSet);
        System.out.println(result);
        String[] real = result.split("");
        Arrays.sort(real);
        String realResult = String.join("", real);
        System.out.println(realResult);


    }

}
