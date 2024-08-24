package org.example.sparta_hard.daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4_138476 {

    // 귤 고르기
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for (Integer v : list) {
            if (sum + v >= k) {
                count++;
                break;
            } else {
                sum += v;
                count++;
            }
        }
        return count;
    }
}
