package test3;

import java.util.ArrayList;

public class Car {
    private String name;
    private int speed;
    private ArrayList<Person> persons = new ArrayList<>();

    public void ride(Person person) {
        persons.add(person);
    }

    public int count() {
        int s = persons.size();
        return s;
    }

    public void info() {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getAge() > 1) {
            person.intro(); }
        }

    }



}
