package org.example.LV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Take_two_and_add_them {
    public static int[] solution(int[] numbers) {
        // list의 contains로 풀기
        int[] answer;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i< numbers.length-1; i++){
            for (int j=i+1; j< numbers.length; j++){
                if (list.contains(numbers[i] + numbers[j])){
                    continue;
                }else{
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(list);

        answer = new int[list.size()];
        for (int i=0; i< answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
