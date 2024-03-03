package org.example.sparta.LV1;

public class average_value_of_array {
    public double solution(int[] numbers) {
        double answer = 0;
        int count = numbers.length;
        for(int i=0; i<count; i++){
            answer += numbers[i];
        }
        answer /= count;
        return answer;
    }

    public static void main(String[] args) {
        average_value_of_array solution = new average_value_of_array();
        int[] numbers = {1,2,3,4,5};

        System.out.println(solution.solution(numbers));
    }
}
