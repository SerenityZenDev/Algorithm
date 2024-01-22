package org.example.LV3;

import java.util.Arrays;

public class Kth_number {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp;
        for (int i=0; i< answer.length; i++){
            temp = new int[commands[i][1] - commands[i][0] + 1];
            int startN = commands[i][0]-1;
            for (int j=commands[i][0] - 1; j<commands[i][1]; j++){
                temp[j-startN] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(solution(array, commands));
    }
}
