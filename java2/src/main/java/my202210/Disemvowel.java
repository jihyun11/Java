package my202210;

public class Disemvowel {
    public static void main(String[] args) {
//        String str = "This website is for losers LOL!";

        String s = "prepinsta";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : "+s1);
    }


}




