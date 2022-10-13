import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    public static String main(String[] args) {

        {
            String phrase = "happy new year!";
            if (null == phrase || phrase.length() == 0) {
                return null;
            }

            return Arrays.stream(phrase.split(" "))
                    .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                    .collect(Collectors.joining(" "));
        }
//        String phrase = "happy new year!";
//
//        String[] st = phrase.split(" ");
//        for(int i = 0; i < st.length; i++) {
//            st[i] = st[i].charAt(0).toUpperCase() + st[i].substring(1);
//        }
//
//        String str = String.join(" ", st);
//        System.out.println(str);
    }
}
