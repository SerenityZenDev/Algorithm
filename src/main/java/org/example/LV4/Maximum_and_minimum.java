package org.example.LV4;

import java.util.HashSet;

public class Maximum_and_minimum {
    public String solution(String s) {
        String answer = "";
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<s.split(" ").length; i++){
            set.add(Integer.valueOf(s.split(" ")[i]));
        }

        int min = set.stream().min(Integer::compareTo).orElse(0);
        int max = set.stream().max(Integer::compareTo).orElse(0);

        answer = min + " " + max;
        return answer;
    }
}
