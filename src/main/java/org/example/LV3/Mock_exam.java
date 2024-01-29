package org.example.LV3;

public class Mock_exam {
    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] first = {1,2,3,4,5}; // 5
        int[] second = {2,1,2,3,2,4,2,5}; // 8
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10

        int[] score = new int[3];

        for (int i=0; i<answers.length; i++){
            if (answers[i] == first[i%5]) score[0]++;
            if (answers[i] == second[i%8]) score[1]++;
            if (answers[i] == third[i%10]) score[2]++;
        }

        int max = 0;
        int count = 0;
        for (int i=0; i<3; i++){
            if (max < score[i]) {
                max = score[i];
                count = 1;
            } else if (max == score[i]) {
                count++;
            }
        }

        answer = new int[count];
        int j = 0;
        for (int i=0; i<3; i++){
            if (max == score[i]) answer[j++] = i+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(solution(answers));
    }
}
