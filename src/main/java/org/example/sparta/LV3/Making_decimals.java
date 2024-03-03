package org.example.sparta.LV3;

public class Making_decimals {
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i=0 ; i<nums.length-2; i++){
            for (int j=i+1; j< nums.length-1; j++){
                for (int k=j+1; k< nums.length; k++){
                    if (isDecimals(nums[i],nums[j],nums[k])) answer++;
                }
            }
        }


        return answer;
    }

    public static boolean isDecimals(int a, int b, int c){
        int sum = a+b+c;

        for (int l = 2; l<=sum/2; l++){
            if (sum % l == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }
}
