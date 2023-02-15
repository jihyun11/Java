package my202212;

public class ConvertFirst {
    public static void main(String[] args) {
        String s = "yes_me_yes";
        String[] words = s.split("[_\\-]");
        s=words[0];
        for(int i=1; i<words.length; i++)
            s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        System.out.println(s);
    }
}
