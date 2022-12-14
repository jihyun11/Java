package my202211;

public class Isogram {
    public static void main(String[] args) {
        String str = "moOse";
        String hi = str.toLowerCase();
        String[] array = hi.split("");
        String first = array[0];

        for (int i = 0; i < array.length; i++) {
            if(first == array[i]) {
                first = array[i];
                System.out.println(false);

            } else if (first != array[i]) {
                first = array[i];
                System.out.println(true);

            }


        }

    }
}
