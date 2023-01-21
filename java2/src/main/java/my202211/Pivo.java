package my202211;

public class Pivo {
    public static void main(String[] args) {
        System.out.println(pivot(5));

    }
    public static int pivot(int n) {
        int first = 1;
        int second = 1;
        int temp = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        return pivot(n -1 ) + pivot(n - 2);


        //n+2번째 항 = n+1번째 + n번째
        // 4 3+2

    }
}

