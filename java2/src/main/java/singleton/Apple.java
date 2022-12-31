package singleton;

public class Apple {
    private Apple() {

    } //객체를 사용하기 위해 & new를 이용한 다른 곳에서의 객체 생성을 막기 위한 생성자

    private static final Apple apple = new Apple(); //1번째 객체

    public void print() {
        System.out.println("나는 사과입니다~!"); //print 하는 메소드
    }

    public static Apple newins() {
        return apple;
    } //객체 사용을 위한 getter/setter 역할을 하는 메소드
}
