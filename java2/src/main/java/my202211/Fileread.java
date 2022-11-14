package my202211;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Fileread {
    public static void main(String[] args) throws IOException {
        File file = new File("jihyun11.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String brr = "";

        HashMap<String, Integer> map = new HashMap<>();

        while ((brr = br.readLine()) != null) {
            

            if (map.containsKey(brr)) {
                map.put(brr, map.get(brr) + 1);
            } else map.put(brr, 1);

        }
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.println(key + " : " + map.get(key) + "개");
        }

    }
}
