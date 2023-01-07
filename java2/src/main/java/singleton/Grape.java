package singleton;

public class Grape {
    private Grape() {

    }
    private static final Grape grape = new Grape();

    public static Grape newinst() {
        return grape;
    }
}
