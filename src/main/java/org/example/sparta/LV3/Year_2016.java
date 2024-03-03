package org.example.sparta.LV3;

public class Year_2016 {
    public static String solution(int a, int b) {
        String answer = "";
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] yoil = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED", };
        if (a == 1){
            return yoil[b%7];
        }else{
            int day = 0;
            for (int i=0; i<a-1; i++){
                day += days[i];
            }
            day += b;
            return yoil[day%7];
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(1,1));
    }
}
