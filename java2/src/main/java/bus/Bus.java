package bus;

import test3.Person;

import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> persons = new ArrayList<>();


    public void start(Person person) {
        persons.add(person);
    }

    public int count() {
        int s = persons.size();
        return s;
    }

    public void busMan(Person person) {
        if (person.name.length() > 0) {
            System.out.println("버스 운전사가 없으면 출발할 수 없습니다!");

        }
        else System.out.println("승객 " + persons.size() +"과 출발합니다~");
    }
}
