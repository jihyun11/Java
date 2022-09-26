import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < list.size(); i++) { //map에 키값 밸류값을 넣는 for문

            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i))+1);
            } else {
                map.put(list.get(i), 1);
            }
        }

        System.out.println(map);


        System.out.println(map.get(1) + " " + map.containsKey(1));

        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key + " : " + map.get(key) + "개");
        }





        // 중복되는 값들이 몇개씩 있는지 출력해보자.(꼭 아래와 같이 출력하지 않아도 된다.)
        // ex) 1 : 4개, 2 : 3개, 3: 3개
        //     }
    }

}