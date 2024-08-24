package org.example.sparta_hard.daily;

import java.util.HashMap;
import java.util.Map;

public class Q8_131127 {

    class Solution {

        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            int days = 10;

            Map<String, Integer> wants = new HashMap<>();

            for (int i = 0; i < want.length; i++) {
                wants.put(want[i], number[i]);
            }

            for (int i = 0; i < discount.length - days + 1; i++) {
                Map<String, Integer> discounts = new HashMap<>();

                for (int j = 0; j < days; j++) {
                    discounts.put(discount[i + j], discounts.getOrDefault(discount[i + j], 0) + 1);
                }

                Boolean isIdentical = true;

                for (String key : wants.keySet()) {
                    if (wants.get(key) != discounts.get(key)) {
                        isIdentical = false;
                        break;
                    }
                }

                answer += isIdentical ? 1 : 0;
            }

            return answer;
        }
    }
}
