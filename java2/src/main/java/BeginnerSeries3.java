public class BeginnerSeries3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;

        int sum = 0;
        int c = 0;
        sum = a + b;
        if (a == b) {
            System.out.println(a);
        } else {
            for (int i = a; i < b + 1; i++) {
                c += i;
            }
            System.out.println(c);
        }
    }
    }

