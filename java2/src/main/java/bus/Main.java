package bus;

public class Main {
    public static void main(String[] args) {
        Person psi = new Person("운전사1");
        bus bb = new bus();

        bb.start(psi);


    }
}
