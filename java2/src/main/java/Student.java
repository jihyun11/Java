public class Student extends Person{
    int grade;

    public Student (String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student() {

    }

    public void studentinfo() {
        System.out.println(name + age + grade);
    }
}
