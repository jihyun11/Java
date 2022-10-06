import java.util.Arrays;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 81118;

        int[] array = new int[200];

        String temp = Integer.toString(n);
        int[] digit = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++)  {
//            digit[i] = temp.charAt(i) - '0';
            int[] nums = Arrays.stream(digit).mapToDouble(Integer::parseInt).toArray();
            double result = Math.pow(nums[], 2);

        }  System.out.println(Arrays.toString(nums));
    }
}
