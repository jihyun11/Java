package my202212;



import java.util.ArrayList;

public class TwoRec {
    static final ArrayList<Long> list = new ArrayList<>();
    public static void main(String[] args) {
        long x = 20;


        System.out.println(num(x));


    }

    public static int num(long x) {
        long number = 0;
        //리스트가 한번만 초기화되게 하기 (담긴 값을 유지시켜야함)

        if ( x == 1) {
            number = 1;
            list.add(number);
            return list.size();
        }


        if (x % 2 == 0) {
            number = x / 2;
            list.add(number);
            return num(number);
        }
        else{
            number = x * 3 + 1;
            list.add(number);
            return num(number);

        }
    }
}
