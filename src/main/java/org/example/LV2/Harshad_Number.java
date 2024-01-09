package org.example.LV2;

public class Harshad_Number {
    public boolean solution(int x) {
        boolean answer = true;

        int digitCount = (int)(Math.log10(x)+1);
        int digitSum = 0;
        int digitX = x;
        for(int i=0; i<digitCount; i++){
            digitSum += digitX % 10;
            digitX = (int)(digitX/10);
        }
        if(x % digitSum == 0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {

        Harshad_Number solution = new Harshad_Number();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(13));
    }
}
