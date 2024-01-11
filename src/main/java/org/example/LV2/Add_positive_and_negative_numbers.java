package org.example.LV2;

public class Add_positive_and_negative_numbers {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};

        Add_positive_and_negative_numbers solution = new Add_positive_and_negative_numbers();
        System.out.println(solution.solution(absolutes,signs));
    }
}
