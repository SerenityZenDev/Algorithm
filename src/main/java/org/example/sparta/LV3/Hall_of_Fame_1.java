package org.example.sparta.LV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hall_of_Fame_1 {
    public static int[] solution(int k, int[] score) {
        int [] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for (int i=0; i< score.length; i++){
            rank.add(score[i]);

            if (rank.size() > k){
                rank.remove(Collections.min(rank));
            }

            answer[i] = Collections.min(rank);
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] a = {10, 100, 20, 150, 1, 100, 200};
        solution(3,a);
    }
}
