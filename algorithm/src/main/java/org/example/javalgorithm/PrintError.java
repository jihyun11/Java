package org.example.javalgorithm;

public class PrintError {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        int error = 0;

        for (int i = 0; i < s.length(); i++) {
            String ones = String.valueOf(s.charAt(i));
            if (ones.compareTo("m") > 0) {
                error++;
            }
        }

        String result = error + "/" + s.length(); //m보다 뒤에 있는 수 비율 구하기
        System.out.println(result);
    }
}
