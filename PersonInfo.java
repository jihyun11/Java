public class PersonInfo {
    public static void main (String[]agrs) {
        Person jihyun = new Person();
        jihyun.setName("jihyun");
        jihyun.setAge(23);

        System.out.println(jihyun.getAge());
        System.out.println(jihyun.getName());


        jihyun.info();
    }


}
