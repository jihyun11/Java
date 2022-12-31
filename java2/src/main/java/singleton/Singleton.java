package singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    public void print() {
        System.out.println("Hello world...");
    }

    public static Singleton newin() {
        return singleton;
    }

    private Singleton() {

    }
}
