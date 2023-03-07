package my202303;

public class RowWeights {
    public static void main(String[] args) {
        int[] weight = {100,51,50,100};


        int first = 0;
        int second = 0;

        for (int i = 0; i < weight.length; i++) {
            if (i % 2 != 0) {
                second += weight[i];
            }
            if (i % 2 == 0) {
                first += weight[i];
            }

        }
        int[] array = {first, second};

        System.out.println(first);
        System.out.println(second);
        System.out.println(array);
    }
}
