package org.example.sparta_hard.daily;

import java.util.HashMap;
import java.util.Map;

public class Q9_42578 {

    class Solution {

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
}
