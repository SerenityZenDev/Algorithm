package org.example.sparta.LV3;

public class Apply_more_paint {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];
        answer++;

        for (int item : section){
            if (start + m > item){
                continue;
            }
            start = item;
            answer++;
        }

        return answer;
    }
}
