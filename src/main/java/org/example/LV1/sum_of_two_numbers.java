package org.example.LV1;

public class sum_of_two_numbers {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        sum_of_two_numbers calculate = new sum_of_two_numbers();
        System.out.println(calculate.solution(10,20));
    }
}
