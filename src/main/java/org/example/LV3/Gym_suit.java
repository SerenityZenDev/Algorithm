package org.example.LV3;

import java.util.Arrays;

public class Gym_suit {
    public static int solution(int n, int[] lost, int[] reserve) {
        /*
        n : 전체 학생의 수
        lost : 체육복을 잃어버린 학생의 번호
        reserve : 체육복을 빌려줄 수 있는 학생의 번호
         */
        int answer = n- lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i=0; i< lost.length; i++){
            for (int j=0; j< reserve.length; j++){
                if (lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i=0; i<lost.length; i++){
            for(int j=0; j< reserve.length; j++){
                if (lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
