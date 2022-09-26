import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        final int Limit = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();
        String sour = source.replace( "[^0-9]", "");
        System.out.println(sour); // 문자열 중 숫자만 출력

        List list = new ArrayList<>(length/Limit + 10);

        for(int i = 0; i < length; i+=Limit) {
            if(i+Limit < length) {
                list.add(source.substring(i, i+Limit));
            } else list.add(source.substring(i));
        } for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
