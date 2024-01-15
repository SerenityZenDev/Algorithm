package org.example.LV2;

public class Calculate_your_shortfall {
    public static long solution(int price, long money, int count) {
        long answer = -1;
        for(int i=1; i<=count; i++){
            money -= price * i;
        }

        if(money < 0){
            return money * answer;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
    }

}
