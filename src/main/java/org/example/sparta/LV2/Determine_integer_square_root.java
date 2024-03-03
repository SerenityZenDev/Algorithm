package org.example.sparta.LV2;

public class Determine_integer_square_root {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        if(sqrt * sqrt == n){
            answer = (sqrt+1)*(sqrt+1);
        }else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Determine_integer_square_root solution = new Determine_integer_square_root();
        System.out.println(solution.solution(121));
        System.out.println(solution.solution(3));
    }
}
