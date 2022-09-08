public class Student {

    public String name;
    public int age;
    public int grade;

    public void info() {
        System.out.println(name + age + grade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name1) {
        this.name = name1;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
