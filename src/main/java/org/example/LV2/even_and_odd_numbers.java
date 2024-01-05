package org.example.LV2;

public class even_and_odd_numbers {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        even_and_odd_numbers solution = new even_and_odd_numbers();
        System.out.println(solution.solution(10));
    }
}
