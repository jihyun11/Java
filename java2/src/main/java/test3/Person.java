package test3;

public class Person {
    public String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printAll() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void intro() {
        System.out.println("저의 이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
    }

    public String name() {
        return this.name;
    }
}
