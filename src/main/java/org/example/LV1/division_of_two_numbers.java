package org.example.LV1;

public class division_of_two_numbers {
        public int solution(int num1, int num2) {
            // 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후
            // 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
            int answer = num1* 1000 / num2 ;
            return answer;
        }


    public static void main(String[] args) {
        division_of_two_numbers solution = new division_of_two_numbers();
        System.out.println(solution.solution(100,50));

    }
}
