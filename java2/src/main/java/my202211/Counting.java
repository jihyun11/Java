package my202211;

public class Counting {
    public static void main(String[] args) {
        String text = "abaB";
        String s = text.toLowerCase();
        int ans = 0;

        while (text.length() > 0) {
            String firstLetter = text.substring(0, 1);
            text = text.substring(1);
            if(text.contains(firstLetter)) {
                ans ++;
                text = text.replace(firstLetter, "");
            }
            System.out.println(ans);
        }
    }
}
