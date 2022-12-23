package my202211;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        String original = "Hi Merry";
        String Hi = "";
        String[] array = original.split(" ");

        String reversed = new StringBuffer(original).reverse().toString();
        System.out.println(reversed);

        List<String> words = Arrays.asList(original.split(" "));
        Collections.reverse(words);
        System.out.println(words.stream().collect(Collectors.joining(" ")));


        String[] array2 = original.split(" ");

        if(array.length == 0)
            System.out.println(original);


                int i = 0;
                for(String string : array){
                    array[i] = new StringBuilder(string).reverse().toString();
                    i++;
                }

                System.out.println(String.join(" ",array));
            }
        }


