package org.example.sparta.LV2;

public class string_to_integer {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        string_to_integer solution = new string_to_integer();
        System.out.println(solution.solution("1234"));
        System.out.println(solution.solution("-1234"));
    }
}
