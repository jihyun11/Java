package my202210;

public class Soldier extends Person{
    String militaryClass;

    public Soldier (String name, int age, String militaryClass) {
        super(name, age);
        this.militaryClass = militaryClass;
    }

    public Soldier() {

    }

    public void soldierinfo() {
        System.out.println(name + age + militaryClass);
    }
}
