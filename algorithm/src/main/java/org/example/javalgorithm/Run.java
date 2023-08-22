package org.example.javalgorithm;


import java.util.HashMap;

public class Run {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        int n = players.length;
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = indexMap.get(calling);
            if (idx > 0) {
                String temp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = temp;

                indexMap.put(players[idx - 1], idx - 1);
                indexMap.put(players[idx], idx);
            }
        }
        System.out.println(players);

    }


}

