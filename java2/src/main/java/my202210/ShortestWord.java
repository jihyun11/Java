package my202210;

public class ShortestWord {
    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";

        String[] words = s.split(" ");
        int small = words[0].length();

        for(int i = 0; i < words.length; i++) {
            if (small > words[i].length()) {
                small = words[i].length();

            }
        }
        System.out.println(small);


    }
}

