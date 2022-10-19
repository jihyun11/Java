import java.util.stream.Stream;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "testes";
        int len = word.length();
        int middle = len / 2;
        String[] str = word.split("");

        String ss = "";
        String sn = "";

        if (len % 2 == 1) {
            ss = str[middle];

        }
        System.out.println(ss);
        if (len % 2 == 0) {
            sn = str[middle-1] + str[middle];
        }
        System.out.println(sn);
    }
}
