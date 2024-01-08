package org.example.LV2;

public class Find_a_number_whose_remainder_is_1 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Find_a_number_whose_remainder_is_1 solution = new Find_a_number_whose_remainder_is_1();
        System.out.println(solution.solution(10));
    }
}
