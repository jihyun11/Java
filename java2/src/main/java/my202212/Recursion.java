package my202212;

public class Recursion {
    public static void main(String[] args) {
        int num = 0;
        Fuction(5);
        System.out.println(Sum(5));
    }
    public static int Fuction(int number) { //문자열을 반복해서 출력하는 재귀함수

        if (number == 0) {
            return 0;
        }
        else {
            System.out.println("Hello world");
            return Fuction(number - 1);
        }
    }

    public static int Sum(int sum) { //0부터 5까지의 합을 구하는 재귀함수

        if (sum == 0) {
            return 0;
        }
        else {


            return sum + Sum(sum - 1);
        }
    }
}
