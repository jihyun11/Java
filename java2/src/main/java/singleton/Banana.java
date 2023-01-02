package singleton;

public class Banana {
    private Banana() {

    }

    private static final Banana banana = new Banana();

    public void print() {
        System.out.println("나는 바나나입니다~!");
    }

    public static Banana newinstan() {
        return banana;
    }
}
