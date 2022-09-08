public class StudentInfo {
    public static void main (String[]args) {
        Student jihyun = new Student();
        jihyun.setName("jihyun");
        jihyun.setAge(23);
        jihyun.setGrade(3);

        System.out.println(jihyun.getName());
        System.out.println(jihyun.getAge());
        System.out.println(jihyun.getGrade());

        jihyun.info();
    }


}
