package my202211;

public class PerfectSquare {
    public static void main(String[] args) {
        long sq = 144;
        String s = String.valueOf(sq);
        String[] array = s.split("");
        int a = 0;
        String b = "";
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] += Integer.parseInt(array[i]);
            a = (newarray[i] * newarray[i]);
            b += Integer.toString(a);
        }
        System.out.println(b);
    }
}
