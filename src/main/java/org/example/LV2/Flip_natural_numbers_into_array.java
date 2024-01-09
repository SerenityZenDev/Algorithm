package org.example.LV2;

public class Flip_natural_numbers_into_array {
    public int[] solution(long n) {
        int[] answer = {};
        int digitCount = (int) (Math.log10(n) + 1);
        answer = new int[digitCount];
        int i=0;

        while(n > 0){
            answer[i++] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Flip_natural_numbers_into_array solution = new Flip_natural_numbers_into_array();
        int[] answer = solution.solution(12345);
        for (int i=0; i< answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
