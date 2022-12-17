package test1;

public class Test {
    public static void main(String[] args) {
        MathUtil mt = new MathUtil();
        mt.math();

        mt.math2(3);

        mt.math4(3); //sout

        int result2 = mt.math4(23); //return
        System.out.println(result2);

        MathUtil st = new MathUtil();

        String result = st.hello();
        System.out.println(result);

        String result3 = st.sunday("happy ");
        System.out.println(result3);

        ChildMathUtil cm = new ChildMathUtil();
        cm.child();
        cm.hello();





    }
}
