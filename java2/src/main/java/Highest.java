public class Highest {
    public static void main(String[] args) {
        String numbers = "5 4 3 2 1 0";

        String[] array = numbers.split(" ");


        String big = array[0];
        String small = array[0];
        String max = "";
        String min = "";

        for(int i = 0; i < array.length; i++) {
            if (Integer.parseInt(big) <= Integer.parseInt(array[i])) {
                max = array[i]; // max와 big은 다른 변수 아님?
            } else if (Integer.parseInt(small) >= Integer.parseInt(array[i]) ) {
                min = array[i];
            }
        }

        System.out.println((max + " " + min));
    }


}
