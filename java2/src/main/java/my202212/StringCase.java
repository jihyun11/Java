package my202212;

public class StringCase {
    public static void main(String[] args) {
       String s = "codE";
        String upp = s.replaceAll("[^A-Z ]", "");
        String low = s.replaceAll("[^a-z ]", "");
        System.out.println(upp.length() > low.length() ? s.toUpperCase() : s.toLowerCase());
    }
    }


