package my202212;

public class SnailUp {
    public static void main(String[] args) {
        int column = 10;
        int day = 3;
        int night = 1;

        int days = 1;
        while (days < column) {
            column -= (day - night);
            days++;
        }
        System.out.println(days);
    }
}
