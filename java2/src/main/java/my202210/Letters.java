package my202210;

import java.util.regex.Pattern;

public class Letters {
    public static void main(String[] args) {
        String st = "Sunday";
        String s = "";
        Pattern ptn = Pattern.compile("a|w|i|o|u|e"); //Pattern 객체의 사용 (.compile
        for (int i = 0; i < st.length(); i++) {
            if(ptn.matcher(String.valueOf(st.charAt(i))).find()) {
                s += String.valueOf(st.charAt(i)).toUpperCase();
            } else {
                s += String.valueOf(st.charAt(i));
            }
        }
        System.out.println(s);

    }

}















