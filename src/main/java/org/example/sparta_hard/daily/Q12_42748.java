package org.example.sparta_hard.daily;

import java.util.Arrays;

public class Q12_42748 {

    class Solution {

        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int[] temp;
            for (int i = 0; i < answer.length; i++) {
                temp = new int[commands[i][1] - commands[i][0] + 1];
                int startN = commands[i][0] - 1;
                for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                    temp[j - startN] = array[j];
                }
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2] - 1];
            }

            return answer;
        }
    }
}
