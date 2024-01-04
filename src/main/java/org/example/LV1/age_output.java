package org.example.LV1;

public class age_output {
    public static int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        int age = 40;
        System.out.println(solution(age));
    }
}
