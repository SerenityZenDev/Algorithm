package org.example.sparta.LV2;

public class Watermelon_water_applause {
    public static String solution(int n) {
        String answer = "";
        boolean holesu;

        if(n % 2 == 1){
            holesu = true;
        }else{
            holesu = false;
        }

        if(holesu){
            for(int i=0; i<(n-1)/2; i++){
                answer += "수박";
            }
            answer += "수";
        }else{
            for(int i=0; i<n/2; i++){
                answer += "수박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

}
