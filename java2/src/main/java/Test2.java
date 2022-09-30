public class Test2 {
    public static int main(String[] args) {
        String str = "asfsdfasfasfs";
        char[] alpha = {'a', 'e', 'i', 'u', 'o'};

            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i)=='a') || (str.charAt(i)=='e') ||
                        (str.charAt(i)=='i') ||
                        (str.charAt(i)=='o') || (str.charAt(i)=='u')) {
                    sum++;
                }

            } return sum;
        }
    }


