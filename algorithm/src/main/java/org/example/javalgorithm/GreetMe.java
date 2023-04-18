package org.example.javalgorithm;

public class GreetMe {
    public static void main(String[] args) {
        String name = "jACk";


        String first  = name.substring(0, 1);
        String second = name.substring(1);

        String firstname = first.toUpperCase();

        String secondname = second.toLowerCase();


        System.out.println(firstname + secondname);
        

    }
}
