package org.example.javalgorithm;

public class EncryptThis {
    public static void main(String[] args) {
        String text = "Hello world";

        String[] array;

        array = text.split("");
        String text2 = text.replace(array[1], array[array.length -1]);



        int a = (int) text.charAt(0);
        String b = String.valueOf(a);
        String ch = text2.replace(array[0], b);

        System.out.println(ch);



//        for (int i = 0; i < array.length; i++) {
//
//        }
    }


}
