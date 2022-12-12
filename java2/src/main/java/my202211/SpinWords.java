package my202211;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpinWords {
    public static void main(String[] args) {
        String sentense = "Hey Welcome";

        String[] array = sentense.split(" ");
        String rev = "";
        String revv = "";
        ArrayList<String> list = new ArrayList<>();
        String[] newArray = {};


        for (int i = 0; i < array.length; i++) {
            if (4 < array[i].length()) {
                rev = array[i];
                StringBuffer sb = new StringBuffer(rev);
                String reversedStr = sb.reverse().toString();

                list.add(reversedStr);



            }
            else if (5 > array[i].length()) {
//                newArray[i] = array[i];
                list.add(array[i]);
            }

        }
        revv = String.join(" ", list);
        System.out.println(revv);
    }
}
