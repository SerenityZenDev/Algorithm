package org.example.sparta.LV4;

import java.util.HashMap;
import java.util.Map;

public class Testing_Your_Personality_Type {
    public String solution(String[] survey, int[] choices) {


        Map<Character, Integer> type = new HashMap<>();

        for (int i=0; i<survey.length; i++){
            int value = choices[i];

            if (value > 0 && value < 4){
                char ch = survey[i].charAt(0);
                type.put(ch, type.getOrDefault(ch,0) + 4 - value);
            } else if (value > 4) {
                char ch = survey[i].charAt(1);
                type.put(ch, type.getOrDefault(ch,0) + value - 4);
            }
        }


        return String.valueOf
            (type.getOrDefault('R', 0) >= type.getOrDefault('T', 0) ? 'R' : 'T')
            + (type.getOrDefault('C', 0) >= type.getOrDefault('F', 0) ? 'C' : 'F')
            + (type.getOrDefault('J', 0) >= type.getOrDefault('M', 0) ? 'J' : 'M')
            + (type.getOrDefault('A', 0) >= type.getOrDefault('N', 0) ? 'A' : 'N');
    }
}
