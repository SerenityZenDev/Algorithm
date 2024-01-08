package org.example.LV2;

public class n_numbers_spaced_apart_by_x {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];

        for(int i=0; i<n; i++){
            // 이렇게 해서 안되는 이유 찾기
//            answer[i] = x;
//            x += answer[0];
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        n_numbers_spaced_apart_by_x solution = new n_numbers_spaced_apart_by_x();
        long[] answer = solution.solution(2,5);

        System.out.print("[ ");

        for (int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }

        System.out.print("]");
    }
}
