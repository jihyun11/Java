import java.util.stream.Stream;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 81118;

        int[] sd = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray(); // String 배열로 만들어서 넣었다가, 다시 int 배열로 형변환
        String sum = "";
        for (int i = 0; i < sd.length; i++) {
            sum += Integer.toString(sd[i] * sd[i]); // 원하는 값 계산 후 합쳐지지 않게 (숫자니까 더해져버림) String으로 다시 형변환

        }
        int summ1 = Integer.parseInt(sum); // 다시 숫자형태로 만들어서 출력
        System.out.println(summ1);
    }
}
