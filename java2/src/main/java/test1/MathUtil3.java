package test1;

public class MathUtil3 {
    public int myNumber(int n) {
//        int sum = 0;
//        for (int i = 0; i < a + 1; i++) {
//            sum += i;
//        }

        return (n + 1) * n / 2;

    }

    public String thankU(String save) {
        String s = "";
        if (save == "어디 해보거라~") {
            s = "파워 세배!!!!";

        }
        else return "시작 말씀을 다시 해주세요~!";
        return s;
    }

}
