public class Highest {
    public static void main(String[] args) {
        String numbers = "5 4 3 2 1";

        String[] array = numbers.split(" ");


        String big = array[0];
        String small = array[0];

        for(int i = 0; i < array.length; i++) {
            if (Integer.parseInt(big) <= Integer.parseInt(array[i])) {
                big = array[i];
            } else if (Integer.parseInt(small) >= Integer.parseInt(array[i]) ) {
                small = array[i];
            }
        }

        System.out.println((big + " " + small));
    }


}
