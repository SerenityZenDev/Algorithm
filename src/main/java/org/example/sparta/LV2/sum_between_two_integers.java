package org.example.sparta.LV2;

public class sum_between_two_integers {
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){
            for(int i=a; i<b+1; i++){
                answer += i;
            }
        }else{
            for(int i=b; i<a+1; i++){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        sum_between_two_integers solution = new sum_between_two_integers();
        System.out.println(solution.solution(3,5));
    }
}
