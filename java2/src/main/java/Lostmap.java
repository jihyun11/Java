import java.util.stream.Stream;

public class Lostmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int c = 0;
        String d = "";
        for (int i =0; i < arr.length; i++) {
            d += arr[i] * 2;

        } int[] b = Stream.of(String.valueOf(d).split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(b);
    }
}
