package org.example.LV3;

import java.util.Arrays;

public class Fruiterer {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int size = score.length;

        while(!(size < m)){
            int min = 10;
            for (int i=0; i<m; i++){
                if (score[size-i-1] < min) min = score[size-i-1];
            }
            answer += min * m;
            size -= m;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(4,3, score));
    }
}
