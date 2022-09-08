public class Person {
    public int age;
    public String name;

    public void info() {
        System.out.println(age + " " + name);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }


}
