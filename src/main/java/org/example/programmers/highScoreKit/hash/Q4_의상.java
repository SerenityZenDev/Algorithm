package org.example.programmers.highScoreKit.hash;

import java.util.HashMap;
import java.util.Map;

public class Q4_의상 {
    public static void main(String[] args) {

    }

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();


        for (int i = 0; i < clothes.length; i++) {
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String wear : clothesMap.keySet()) {
            answer *= (clothesMap.get(wear) + 1);
        }

        answer -= 1;

        return answer;
    }
}
