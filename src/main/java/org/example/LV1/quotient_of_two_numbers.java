package org.example.LV1;

public class quotient_of_two_numbers {
    public static int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {
        int result = 0;
        result = solution(20, 2);
        System.out.println(result);
    }
}
