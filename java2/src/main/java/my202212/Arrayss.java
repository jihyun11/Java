package my202212;

public class Arrayss {
    public static void main(String[] args) {
        int n = 10;
        String firstValue = "red";
        String secondValue = "blue";

        String[] output = new String[n];
        String lastUsed = secondValue;
        for(int i = 0; i < n; i++) {
            if(lastUsed.equals(secondValue)) {
                output[i] = firstValue;
                lastUsed = firstValue;
            }
            else {
                output[i] = secondValue;
                lastUsed = secondValue;
            }
        }
        System.out.println(output);
    }



}
