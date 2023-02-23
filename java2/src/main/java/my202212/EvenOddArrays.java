package my202212;

public class EvenOddArrays {
    public static void main(String[] args) {
        String s = "abcdef";

        char[] charArrEven = s.toCharArray();
        char[] charArrOdd = s.toCharArray();
        for (int i = 1; i < charArrEven.length; i+=2) {
            charArrEven[i] = Character.toUpperCase(charArrEven[i]);
        }
        for (int i = 0; i < charArrOdd.length; i+=2) {
            charArrOdd[i] = Character.toUpperCase(charArrOdd[i]);
        }
        System.out.println(new String[]{String.valueOf(charArrOdd), String.valueOf(charArrEven)});
    }
}
