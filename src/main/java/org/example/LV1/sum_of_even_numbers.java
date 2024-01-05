package org.example.LV1;

public class sum_of_even_numbers {
    public int solution(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sum_of_even_numbers solution = new sum_of_even_numbers();
        System.out.println(solution.solution(100));
    }
}
