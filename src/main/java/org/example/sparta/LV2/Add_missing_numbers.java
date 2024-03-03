package org.example.sparta.LV2;

public class Add_missing_numbers {
    public static int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<10; i++){
            answer += i;
        }

        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }
}
