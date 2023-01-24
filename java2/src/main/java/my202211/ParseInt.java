package my202211;

import java.util.EmptyStackException;
import java.util.Stack;

public class ParseInt {
    public static void main(String[] args) {
        //스택을 활용한 문자열 구분하기
        String braces = "(){}[]";
        char item = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else {
                try {
                    item = st.pop();
                } catch (EmptyStackException e) {
                    System.out.println("False");
                }
                if ((c == ')' && item != '(') || (c == '}' && item != '{' || (c == ']' && item != '['))) {
                    System.out.println("Fasle");
                }
            }
        }
        System.out.println(st.isEmpty());

    }
}
