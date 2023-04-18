package org.example.javalgorithm;

public class BumpsintheRoad {
    public int sum;

    public static void main(String[] args) {
        int sum = 0;

        String road = "______n___n_";

        String[] array = road.split("");
        for (int i = 0; i < road.length(); i++) {
            if (array[i].equals("n")) {
                sum += 1;
            }

        }
        if (sum <= 15) {
            System.out.println("Woohoo!");
        } else System.out.println("Car Dead");

    }
}
