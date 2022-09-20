public class ArrayListDomo {
    ArrayList<String> al = ArrayList<>();
    ArrayList array = new ArrayList("jihyun");
    ArrayList arrayy = new ArrayList("Hi");

    al.add(array);
    al.add(arrayy);

    for(int i = 0; i < al.size(); i++) {
        ArrayList arrayList = al.get(i);
        System.out.println(arrayList);
    }

}