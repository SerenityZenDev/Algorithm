package org.example.LV2;

public class sum_of_divisors {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if (n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        sum_of_divisors solution= new sum_of_divisors();
        System.out.println(solution.solution(12));
    }
}
