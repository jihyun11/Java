package bus;

public class Main {
    public static void main(String[] args) {
        Person psi = new Person("운전사1");
        Bus bb = new Bus();

        bb.start(psi);


    }
}
