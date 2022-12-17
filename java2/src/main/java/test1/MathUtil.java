package test1;

public class MathUtil {
    public void math() {
        System.out.println("Hello World");
    }

    void math2(int a) {
        System.out.println(a);
    }

    private int math3(int a) {
        int result = a * 2;
        return result;
    }

    protected int math4(int a) {
        int result = a + 100;
        System.out.println(result);
        return result;
    }

    protected String hello() {
        return "Hello world";
    }

    private String satday(String satt) {
        String sat = satt + "Saturday";
        return sat;
    }

    public String sunday(String s) {
        String satt = satday(s);
        return satt;
    }







}
