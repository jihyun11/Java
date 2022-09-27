import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test2 {
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

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (hashMap.containsKey((list.get(i)))) {
                hashMap.put(list.get(i), hashMap.get(list.get(i) +1 ));
            } else {
                hashMap.put(list.get(i), 1);
            }
            Set<Integer> keys = hashMap.keySet();
            for (int key : keys) {
                System.out.println(key + " : " + hashMap.get(key) + "개");
            }
        }
    }

}
