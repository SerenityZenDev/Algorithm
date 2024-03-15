package org.example.sparta.daily;

import java.util.HashMap;
import java.util.Map;

public class D9_Running {
        public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> ranking = new HashMap<>();

            for (int i=0; i< players.length; i++){
                ranking.put(players[i], i);
            }

            for (String player : callings) {
                int playerRank = ranking.get(player);

                String frontP = players[playerRank-1];

                ranking.replace(frontP, playerRank);
                players[playerRank] = frontP;

                ranking.replace(player, playerRank-1);
                players[playerRank-1] = player;
            }

            return players;
    }
}
