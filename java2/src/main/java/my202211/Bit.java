package my202211;

public class Bit {
    public static void main(String[] args) {
        int n = 1234;
        String binary = Integer.toBinaryString(n);


        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < binary.length(); i++) {
            sum = Integer.parseInt(String.valueOf(binary.charAt(i)));
            sum2 += sum;

        }
        System.out.println(sum2);

    }


}
