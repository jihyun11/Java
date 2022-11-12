package my202210;

public class Abbreviate {
    public static void main(String[] args) {
        String name = "Sam Harris";
        name = name.toUpperCase(); // 약자 표현을 위해 먼저 모든 문자를 대문자로 바꿔 준다.

        String[] names = name.split(" "); //split() 괄호 안의 기호를 기준으로 배열을 잘라 준다.
        String names1 = names[0]; //잘린 배열 중 0번째, 즉 SAM을 첫 번째 배열에 담았다.
        String names2 = names[1]; // 잘린 배열 중 1번째, 즉 HARRIS를 두 번째 배열에 담았다.


        System.out.println(names1.charAt(0)+"."+names2.charAt(0));

    }
}
