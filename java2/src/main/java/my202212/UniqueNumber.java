package my202212;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        double arr[] = {0, 1, 0};
        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println(arr[0] == arr[1] ? arr[arr.length - 1] : arr[0]);

        }
    }

