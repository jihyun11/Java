import java.util.ArrayList;

public class StudentUse {
    public static void main(String[] args) {
        Student st = new Student("jihyun", 23, 3);
        Student sd = new Student("hi", 1, 3);
        Student su = new Student("bye", 2, 4);
        st.studentinfo();

        ArrayList<Student> list = new ArrayList<>();
        list.add(st);
        list.add(sd);
        list.add(su);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.studentinfo();
        }

    }


}
