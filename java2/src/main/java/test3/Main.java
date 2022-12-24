package test3;

public class Main {
    public static void main(String[] args) {
        Person ps = new Person("치이카와", 2);
        Person ps1 = new Person("하치와레", 2);
        Person ps2 = new Person("우사기", 2);
        Person ps3 = new Person("모몽가", 1);
        Person ps4 = new Person("갑옷씨", 213412);
        Person ps5 = new Person("풍뎅이", 1);
        Car car = new Car();

        car.ride(ps);
        car.ride(ps1);
        car.ride(ps2);
        car.ride(ps3);
        car.ride(ps4);
        car.ride(ps5);

        int count = car.count();
        System.out.println(count);

        car.info();



    }
}
