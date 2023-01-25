package my202212;

public class Recursion {
    public static void main(String[] args) {
        Fuction(5);
    }
    public static int Fuction(int number) {

        if (number == 0) {
            return 0;
        }
        else {
            System.out.println("Hello world");
            return Fuction(number - 1);
        }
    }
}
