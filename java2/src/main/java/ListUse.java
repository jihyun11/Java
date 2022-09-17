import java.util.ArrayList;

public class ListUse {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        Person ps = new Person("jihyun", 23);
        Person pss = new Person("hi", 2);
        list.add(ps);
        list.add(pss);
        System.out.println(list.size());
        Person pn = new Person("bye", 1);
        list.add(pn);
//        Person person = list.get(0);
//        Person person1 = list.get(1);
//        person.personinfo();
//        person1.personinfo();

        for (int i =0; i < list.size(); i++) {
            Person person = list.get(i);
            person.personinfo();

        }

    }
}
