import java.sql.SQLOutput;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("고양이");
        list.add("고양이");
        list.add("고양이");
        list.add("고양이");
        list.add("사자");
        list.add("사자");
        list.add("사자");
        list.add("사자");
        list.add("표범");
        list.add("표범");
        list.add("표범");
        list.add("표범");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1 );
            } else {
                map.put(list.get(i), 1);
            }
        }

        Set<String> set = map.keySet();

        for (String key: set){
            System.out.println(key + " : " + map.get(key) + "개");

        }


        // list에 있는 값들이 중복이 안되도록 출력하기

        // 각 값들이 몇개씩 있는지 출력하기
    }
}
