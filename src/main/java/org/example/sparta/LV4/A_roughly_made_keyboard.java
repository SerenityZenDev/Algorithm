package org.example.sparta.LV4;

import java.util.HashMap;

public class A_roughly_made_keyboard {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> list = new HashMap<>();

        for (int i=0; i< keymap.length; i++){
            for (int j=0; j<keymap[i].length(); j++){
                char temp = keymap[i].charAt(j);
                if (list.containsKey(temp)){
                    int index = list.get(temp);
                    list.put(temp, Math.min(index, j+1));
                }else{
                    list.put(temp, j+1);
                }
            }
        }

        for (int i=0; i< targets.length; i++){
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for (char temp : target.toCharArray()){
                if (list.containsKey(temp)){
                    count += list.get(temp);
                } else {
                    flag = false;
                    break;
                }
            }
            answer[i] = flag == false ? -1 : count;
        }


        return answer;
    }
}
