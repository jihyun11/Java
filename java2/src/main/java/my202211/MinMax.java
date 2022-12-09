package my202211;

public class MinMax {
    public static void main(String[] args) {
        String numbers = "1 2 3";
        String[] array = numbers.split(" ");


        String big = array[0];
        String small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(big) <= Integer.parseInt(array[i])) {
                big = array[i];
            } else if (Integer.parseInt(small) >= Integer.parseInt(array[i])) {
                small = array[i];
            }
        }

        System.out.println((big + " " + small));
    }

    }




