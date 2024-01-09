package org.example.LV2;

public class Sort_by_integer_in_descending_order {
    public long solution(long n) {
        long answer = 0;
        char[] digits = Long.toString(n).toCharArray();

        for(int i=0; i< digits.length; i++){
            for(int j=0; j< digits.length-i-1; j++){
                if(digits[j] < digits[j+1]){
                    char temp = digits[j];
                    digits[j] = digits[j+1];
                    digits[j+1] = temp;
                }
            }
        }

        answer = Long.parseLong(new String(digits));
        return answer;
    }

    public static void main(String[] args) {
        Sort_by_integer_in_descending_order solution = new Sort_by_integer_in_descending_order();
        System.out.println(solution.solution(118372));
    }
}
