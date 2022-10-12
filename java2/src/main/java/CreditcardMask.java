public class CreditcardMask {
    public static void main(String[] args) {
        String str = "1232454535442";
        String[] strr = str.split(""); //split() 으로 문자열을 잘라서 배열로 만들기 (for문을 쓰기 위해)
        for (int i = 0; i < strr.length -4; i++) { //배열의 길이 -4까지 반복
            strr[i] = "#";

        } String st = String.join("", strr); //join() 으로 자른 후 배열을 다시 문자열로 만들기
        System.out.println(st);
    }
}
