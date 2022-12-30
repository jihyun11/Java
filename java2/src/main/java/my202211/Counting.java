package my202211;

import java.util.*;

public class Counting {
    public static void main(String[] args) {
        int[] a = {1, 2};



        List<Integer> first = Arrays.asList(a[0], a[1]);
        List<Integer> second = Arrays.asList(2, 3);

        List<Integer> diff = new ArrayList<>(first);
        diff.removeAll(second);

        System.out.println(diff);


        int[] b = {2};


//        Set<int[]> setA = new HashSet<>(Arrays.asList(a));
//        Set<int[]> setB = new HashSet<>(Arrays.asList(b));
//
//        Set<int[]> setC = new HashSet<>();
//        setA.removeAll(setB);
//
//
//        System.out.println(setA.toString());


    }

}

