package test2;

import test1.MathUtil;

public class ChildMathUtil extends MathUtil {
    public void child() {
        String child = sunday("Hi ");
        System.out.println(child);
        String ch = hello();
        System.out.println(ch);
    }
}
