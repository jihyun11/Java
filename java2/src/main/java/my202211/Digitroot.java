package my202211;

public class Digitroot {
    public static void main(String[] args) {
        int n = 456;
        String newN = Integer.toString(n);
        String[] array = newN.split("");
        int[] num = new int[array.length];
        int sum = 0;
        int summ = 0;

        if(array.length > 1) {
            for(int i = 0; i < array.length; i++) {
                num[i] = Integer.parseInt(array[i]);
                sum += num[i];
            }
            System.out.println(sum);

        }
        if (sum > 10) {
            newN = Integer.toString(sum);
            array = newN.split("");
            for (int i = 0; i <array.length; i++) {
                num[i] = Integer.parseInt(array[i]);
                summ += num[i];
            }
        }
        System.out.println(summ);


    }





    }

